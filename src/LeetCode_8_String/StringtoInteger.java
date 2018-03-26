package LeetCode_8_String;

/*
 * @Author: Scott_wu
 * @Description:
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
