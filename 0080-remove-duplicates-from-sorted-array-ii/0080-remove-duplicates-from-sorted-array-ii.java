class Solution {
    public int removeDuplicates(int[] nums) {
        int dups = 0;
        int count = 1;
        int val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == val && count >= 2) {
                dups++;
            } else if (nums[i] == val) {
                val = nums[i];
                nums[i - dups] = nums[i];
                count++;
            } else {
                val = nums[i];
                nums[i - dups] = nums[i];
                count = 1;
            }
        }
        return nums.length - dups;
    }
}