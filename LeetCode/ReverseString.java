/*
Author: Zhao Liu
Email: Liuzhaobest@gmail.com
Date: Nov 20 2019
*/
/*
344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.
 */

/*
My thoughts:
1. If no extra space used, just interchange 2 characters at a time. O(n) time complexity
 */

public class ReverseString {
    public static void main(String[] args)
    {

    }
    public static void reverseString(char[] s) {
        char temp;
        int i=0, j = s.length - 1;
        while(i < j)
        {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

    }
}
