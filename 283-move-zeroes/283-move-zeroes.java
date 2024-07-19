class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroPointer = 0; // Points to the position where the next non-zero element should be placed

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero
            if (nums[i] != 0) {
                // Swap the non-zero element with the element at nonZeroPointer
                int temp = nums[i];
                nums[i] = nums[nonZeroPointer];
                nums[nonZeroPointer] = temp;

                // Move the nonZeroPointer to the next position
                nonZeroPointer++;
            }
        }
    }
}
