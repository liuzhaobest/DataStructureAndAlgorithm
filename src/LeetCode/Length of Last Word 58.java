/*

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5
*/

class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0){
            return 0;
        }
        int count = 0;
        int preCount = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' '){
                count = 0;
            }
            else{
                count++;
                preCount = count;
            }
            
        }
        return (count == 0) ? preCount : count;
        
    }
}
