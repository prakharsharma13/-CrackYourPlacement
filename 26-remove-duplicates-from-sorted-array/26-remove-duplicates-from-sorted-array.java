class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int uniqueCount = 1; // Initialize with 1 since the first element is always unique
        int currentUniqueValue = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != currentUniqueValue) {
                currentUniqueValue = nums[i];
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        
        return uniqueCount;
    }
}
