class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0, oneCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (nums[i] == 1) {
                oneCount++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount != 0) {
                nums[i] = 0;
                zeroCount--;
            } else if (oneCount != 0) {
                nums[i] = 1;
                oneCount--;
            } else {
                nums[i] = 2;
            }
        }
    }
}