package LeetCode;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        int[] num1 = {0,0,0,0};
        int[] num2 = {2,5,6,7};
        aBetterIdea(num1,0,num2,4);
        for(int i =0; i < num1.length; i++){
            System.out.println(num1[i]);
        }

    }

    public static void aBetterIdea(int[] nums1, int m, int[] nums2, int n){
        int p1 = m - 1;
        int p2 = n - 1;
        int total = m + n - 1;
        while(p1 >= 0 && p2 >= 0){
            nums1[total--] = (nums1[p1] > nums2[p2] ? nums1[p1--]:nums2[p2--]);
        }
        System.arraycopy(nums2,0,nums1,0,p2 + 1);
    }

    public static void myOriginalSolution(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        for(int i = 0; i < m; i++){
            nums1[len-1-i] = nums1[len-1-i-n];
        }

        int pointer1 = len - m;
        int pointer2 = 0;
        for(int i = 0; i < m + n; i++){
            if(pointer2 == n){
                nums1[i] = nums1[pointer1];
                pointer1++;
            }
            else if(pointer1 == len){
                nums1[i] = nums2[pointer2];
                pointer2++;
            }
            else if(nums1[pointer1] <= nums2[pointer2]){
                nums1[i] = nums1[pointer1];
                pointer1++;
            }
            else{
                nums1[i] = nums2[pointer2];
                pointer2++;
            }
        }


    }
}
