class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (slow < nums.length) {
            if (fast == nums.length) {
                nums[slow++] = 0;
            } else if (nums[fast] == 0) {
                fast++;
            } else {
                nums[slow++] = nums[fast++];
            }
        }
    }
}