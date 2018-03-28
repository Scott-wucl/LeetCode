package LeetCode_11_Container;

/*
 * @Author: Scott_wu
 * @Description:
 * @Date: Created in 19:37 2018/3/28
 */
class Solution {
    static int i,j,max;
    private int area(int l,int s,int h){
        if (l < s) return h*l;
        return h*s;
    }
    private void find_maxI(int[] height){
        int temp;
        while (i < j && height[i] < height[j]){
            temp = area(height[i],height[j],j-i);
            if (temp > max) max = temp;
            i++;
        }
        if (i >= j) return;
        temp = area(height[i],height[j],j-i);
        if (temp > max) max = temp;
        return;
    }
    private void find_maxJ(int[] height){
        int temp;
        while (i < j && height[i] > height[j]){
            temp = area(height[i],height[j],j-i);
            if (temp > max) max = temp;
            j--;
        }
        if (i >= j) return;
        temp = area(height[i],height[j],j-i);
        if (temp > max) max = temp;
        return;
    }
    public int maxArea(int[] height) {
        int now_i,now_j;
        i = 0; j = height.length-1; max = 0;
        while (i < j){
            while (i < j && height[i] == 0) i++;
            while (i < j && height[j] == 0) j--;
            if (i == j) break;
            now_i = i;
            now_j = j;
            if (height[i] < height[j]) {
                find_maxI(height);
            } else {
                find_maxJ(height);
            }
            if (i < j && now_i == i && now_j == j) j--;
        }
        return max;
    }
}
public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {2,3,4,5,18,17,6};
        System.out.println(solution.maxArea(array));
    }
}
