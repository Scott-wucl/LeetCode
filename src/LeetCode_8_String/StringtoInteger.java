package LeetCode_8_String;

/*
 * @Author: Scott_wu
 * @Description:
 *  TODO Question:
 *      Implement atoi to convert a string to an integer.
 *      Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself
 *          what are the possible input cases.
 *      Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to
 *          gather all the input requirements up front.
 *
 *      Requirements for atoi:
 *          The function first discards as many whitespace characters as necessary until the first non-whitespace
 *          character is found. Then, starting from this character, takes an optional initial plus or minus sign
 *          followed by as many numerical digits as possible, and interprets them as a numerical value.
 *          The string can contain additional characters after those that form the integral number, which are ignored
 *          and have no effect on the behavior of this function.
 *          If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such
 *          sequence exists because either str is empty or it contains only whitespace characters, no conversion
 *          is performed.
 *          If no valid conversion could be performed, a zero value is returned. If the correct value is out of
 *          the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 * @Date: Created in 18:35 2018/3/26
 */


class Solution{
    public int myAtoi(String str) {
        if (str == "") return 0;
        int start = 0, end;
        int c = 1, length = str.length();
        while (start < length && (str.charAt(start) == ' ' || str.charAt(start) == '\n' || str.charAt(start) == '\r')) start++;
        if (start == length) return 0;
        if (str.charAt(start) == '-') {
            c = -1;
            start++;
        } else if (str.charAt(start) == '+') start++;
        end = start;
        while (end < length && str.charAt(end) <= '9' && str.charAt(end) >= '0') end++;
        if (end == start) return 0;
        if (end - start > 10) {
            if (c > 0) return Integer.MAX_VALUE;
            return Integer.MIN_VALUE;
        }
        long result = Long.parseLong(str.substring(start,end));
        result *= c;
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)result;
    }
}

public class StringtoInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("+1"));
    }
}
