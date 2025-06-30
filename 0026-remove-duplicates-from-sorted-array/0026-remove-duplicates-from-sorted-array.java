class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 1;
        int duplicates = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicates++;
            } else {
                nums[i - duplicates] = nums[i];
                unique++;
            }
        }
        return unique;
    }
}