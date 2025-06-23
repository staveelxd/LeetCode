class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        bisearch(numbers, target, ret, 0, numbers.length - 1);
        return ret;
    }
    private void bisearch(int[] numbers, int target, int[] ret, int l, int r) {
        if (l==r)
            return;
        int sum = numbers[l] + numbers[r];
        if (sum == target) {
            ret[0] = l+1;
            ret[1] = r+1;
            return;
        }
        int mid = l+(r-l)/2;
        if (sum < target) {
            if (numbers[mid] + numbers[r] <= target)
                bisearch(numbers, target, ret, mid, r);
            else
                bisearch(numbers, target, ret, l+1, r);
        }
        else {
            if (numbers[l] + numbers[mid] > target)
                bisearch(numbers, target, ret, l, mid);
            else
                bisearch(numbers, target, ret, l, r-1);
        }
    }
}