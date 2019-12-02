package zuochengyun;

/*
Giving an int array, arr[i] == k means you can jump to the right from i with distance 1 to k
For example, arr[2] == 3 means you can just to location 3,4,or 5 from 2. If you start from location 0
return the minimize number of jumps to the last location of arr

Example:
arr = [3,2,3,1,1,4]
return 2
*/


public class jumpingGame235 {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,1,4};
        System.out.println(numJump(arr));
    }

    public static int numJump(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        int num = 0;
        int cur = 0;
        int next = 0;
        // for each location, find the minimum number to jump to
        for(int i = 0; i < arr.length; i++){
            if(cur < i){
                num++;
                cur = next;
            }
            next = Math.max(next, arr[i] + i);
        }
        return num;
    }
}
