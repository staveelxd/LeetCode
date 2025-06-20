class Solution {
    public int removeDuplicates(int[] nums) {
        int dups = 0;
        int curval = nums[0];
        int unique = 1;
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == curval) {
                dups++;
            } else {
                curval = nums[i];
                unique++;
                nums[i - dups] = curval;
            }
        }
        return unique;
    }
}