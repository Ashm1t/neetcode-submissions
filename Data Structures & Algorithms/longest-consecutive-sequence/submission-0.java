class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        // Step 1: Put everything in the set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Iterate through set
        for (int num : set) {

            // Only start if it's the beginning of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int length = 1;

                // Expand the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}