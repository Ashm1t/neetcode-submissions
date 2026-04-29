class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prod = 1;
        int zeroCount = 0;

        // FIRST LOOP
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                prod *= num;
            }
        }

        int[] arr = new int[nums.length];

        // SECOND LOOP
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                arr[i] = 0;
            } else if (zeroCount == 1) {
                arr[i] = (nums[i] == 0) ? prod : 0;
            } else {
                arr[i] = prod / nums[i];
            }
        }

        return arr;
    }
}