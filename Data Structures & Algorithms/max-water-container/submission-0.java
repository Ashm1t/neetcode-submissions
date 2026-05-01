class Solution {
    public int maxArea(int[] heights) {
        int i = 0, k = heights.length - 1;
        int maxar = 0;

        while (i < k) {
            int area = Math.min(heights[i], heights[k]) * (k - i);
            maxar = Math.max(maxar, area);

            if (heights[i] < heights[k]) i++;
            else k--;
        }

        return maxar;
    }
}
