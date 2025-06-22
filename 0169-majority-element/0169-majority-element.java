class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int major = 0;
        for(int num : nums) {
            if(counts.containsKey(num)) {
                counts.put(num, counts.get(num) + 1);
                if (counts.get(num) > nums.length / 2) {
                    major = num;
                }
            } else {
                counts.put(num, 1);
                if (counts.get(num) > nums.length / 2) {
                    major = num;
                }
            }
        }
        return major;
    }
}