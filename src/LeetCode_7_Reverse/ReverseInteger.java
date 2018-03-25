package LeetCode_7_Reverse;

/*
 * @Author: Scott_wu
 * @Description:
 * @Date: Created in 16:47 2018/3/25
 */

class Solution{
    public int reverse(int x) {
        int flag = 1;
        long result = 0;
        if (x < 0) {
            flag = -1;
            x = -x;
        }
        while (x > 0){
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        if (result > Integer.MAX_VALUE) return 0;
        result *= flag;
        return (int) result;
    }
}

public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(0));
    }
}
