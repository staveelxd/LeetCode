class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sums = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (sums.containsKey(nums[i])) {
                return new int[] {sums.get(nums[i]), i};
            }
            sums.put(target - nums[i], i);
        }
        return new int[]{0, 1};
    }
}