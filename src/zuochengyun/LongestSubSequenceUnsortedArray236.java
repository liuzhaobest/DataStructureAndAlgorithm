package zuochengyun;
/*
given an unsorted array, return the length os the longest sequence
Example:
arr = [100,4,200,1,3,2]
longest sequence [1,2,3,4]
return 4
 */


import java.util.HashMap;

public class LongestSubSequenceUnsortedArray236 {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        int max = 1; // to record the max length
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
                if (map.containsKey(arr[i] - 1)) {
                    max = Math.max(max, merge(map, arr[i] - 1, arr[i]));
                }
                if (map.containsKey(arr[i] + 1)) {
                    max = Math.max(max, merge(map, arr[i], arr[i] + 1));
                }
            }
        }
        return max;
    }

    public static int merge(HashMap<Integer, Integer> map, int small, int large){
        int left = small - map.get(small) + 1;
        int right = large + map.get(large) - 1;
        int len = right - left + 1;
        map.put(left, len);
        map.put(right,len);
        return len;
    }
}
