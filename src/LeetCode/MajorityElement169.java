/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.
*/

/*
Some very intersting ideas here
https://leetcode.com/problems/majority-element/solution/
*/

// TODO
/*
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length(); i++){
            if(map.containsKey(nums[i]){
                map.put(nums[i],map.get(nums[i]+1));
            }
            else{
                map.put(nums[i],1);
            }
            // find the key with the largest value.
        }
    }
}*/
