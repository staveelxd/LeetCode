class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int shift = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                if(shift != 0){
                    nums[i - shift] = nums[i];
                }
                k++;
            }
            if (nums[i] == val) {
                shift++;
            }
        }
        return k;
    }
}