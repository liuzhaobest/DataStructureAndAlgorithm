package LeetCode;/*
Author: Zhao Liu
Email: Liuzhaobest@gmail.com
Date: Nov 20 2019
*/
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

/*
Notes by myself. There are two things to notice about this question. First, what is the difference when the
given array is sorted or unsorted?
1. If it is sorted, we can use the double squeeze method. Squeeze from both sides and get what we want.
2. If it is unsorted, we use space to trade for time complexity. Hashmap has a O(1) search time which we can use.
 */
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public static void main(String[] args)
    {
        int[] arr = {2,3,4};
        int target = 6;
        int[] answer = twoSum(arr,target);
        System.out.print(answer[0]);
        System.out.print(answer[1]);
    }

    // unsorted array part
    public static int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                return new int[] {map.get(nums[i]),i};
            }
            map.put(target - nums[i],i);
        }
        return null;

    }


    // sorted array part
    public static int[] twoSumForSortedArray(int[] nums, int target) {
        int i =0, j = nums.length - 1;
        int[] re = {100,200};
        while(i<j)
        {
            if((nums[i]+nums[j]) == target)
            {
                re[0] = i;
                re[1] = j;
                return re;
            }
            else if((nums[i]+nums[j]) > target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return re;
    }



}
