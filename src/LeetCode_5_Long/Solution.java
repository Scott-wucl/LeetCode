package LeetCode_5_Long;

/*
 * @Author: Scott_wu
 * @Description:
 * @Date: Created in 20:10 2018/3/19
 */

class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        int max = 1, j;
        String string, result = s.substring(0,1);
        for (int i = 0; i < length; i++){
            j = length-1;
            while (i < j){
                while (s.charAt(j) != s.charAt(i)) j--;
                string = s.substring(i,j+1);
                if (palindromic(string) && max < string.length()){
                    max  = string.length();
                    result = string;
                }
                j--;
            }
        }
        return result;
    }

    private boolean palindromic(String string) {
        int length = string.length();
        int j;
        for (int i = 0; i < length; i++){
            j = length - i - 1;
            if (string.charAt(i) != string.charAt(j)) return false;
        }
        return true;
    }
}
