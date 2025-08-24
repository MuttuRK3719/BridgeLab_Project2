package customcollections.stack;

import java.util.Stack;

public class LargestRectangle {
    public static void main(String[] args) {
        int[]arr={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));//5*5=10
    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxHeight = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            int currentHeight = i == n ? 0 : heights[i];
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()], width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxHeight = Math.max(maxHeight, height * width);
            }
            stack.push(i);
        }
        return maxHeight;
    }
}
