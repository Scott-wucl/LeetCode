package LeetCode_6_ZigZag;

/*
 * @Author: Scott_wu
 * @Description:
 * @Date: Created in 20:42 2018/3/20
 */

import java.util.ArrayList;
import java.util.List;

class Solution{
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        int up_or_down = 1;
        int line = 0;
        int length = s.length();
        int l;
        List<List<Character>> ZigZag = new ArrayList<>();
        List<Character> ZigZag_line;
        String result = "";
        for (int i = 0; i < numRows; i++) {
            ZigZag_line = new ArrayList<>();
            ZigZag.add(ZigZag_line);
        }
        for (int i = 0; i < length; i++) {
            ZigZag.get(line).add(s.charAt(i));
            if (line == numRows-1 && up_or_down == 1) up_or_down = -1;
            if (line == 0 && up_or_down == -1) up_or_down = 1;
            line += up_or_down;
        }
        for (int i = 0; i < ZigZag.size(); i++) {
            ZigZag_line = ZigZag.get(i);
            l = ZigZag_line.size();
            for (int j = 0; j < l; j++) {
                result += ZigZag_line.get(j).toString();
            }
        }
        return result;
    }
}

public class ZigZagConversion {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("A",0));
    }
}
