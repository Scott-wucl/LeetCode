package LeetCode_9_Palindrome;

/*
 * @Author: Scott_wu
 * @Description:
 *  TODO Question:
 *      Determine whether an integer is a palindrome. Do this without extra space.
 * @Date: Created in 19:49 2018/3/27
 */

class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        String reverse_num = "";
        int length = num.length();
        for (int i = length-1; i >= 0; i--) {
            reverse_num += num.charAt(i);
        }
        if (reverse_num.equals(num)) return true;
        return false;
    }
}
public class PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(Integer.MAX_VALUE));
    }
}
