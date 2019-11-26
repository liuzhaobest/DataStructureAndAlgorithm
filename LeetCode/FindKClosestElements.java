import java.util.List;
/*
Author: Zhao Liu
Email: Liuzhaobest@gmail.com
Date: Nov 20 2019
*/
/*
Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.

Example 1:
Input: [1,2,3,4,5], k=4, x=3
Output: [1,2,3,4]
Example 2:
Input: [1,2,3,4,5], k=4, x=-1
Output: [1,2,3,4]
Note:
The value k is positive and will always be smaller than the length of the sorted array.
Length of the given array is positive and will not exceed 104
Absolute value of elements in the array and x will not exceed 104
*/

/*
My thoughts: Find the element closest to x first, then expend both way.
If the element is in the arr, put the element into the solution arr
If the element is not in the arr, insert the element but do not put the element into the solution arr
We need to get the two points that next to the element x
If found, just the pre and next.
If not found, record the two pointers during the binary search.
 */



/*
public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int[] re = new int[k];
        // TODO




    }
}
*/