class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            // Compare the current element with the next, considering rotation
            if (nums[i] > nums[(i + 1) % length]) {
                count++;
                // More than one drop means it cannot be a rotated sorted array
                if (count > 1) {
                    return false;
                }
            }
        }

        return true; // At most one drop, valid rotated sorted array
    }
}
