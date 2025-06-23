class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0, f = 1;
        while (s < numbers.length) {
            f = s + 1;
            while (f < numbers.length) {
                if (numbers[s] + numbers[f] == target) {
                    return new int[]{s+1,f+1};
                } else {
                    f++;
                }
            }
            s++;
        }
        throw new IllegalArgumentException("No solution");
    }
}