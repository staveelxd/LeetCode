class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> nums1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int num : arr1) {
            nums1.add(num);
        }
        for (int num : arr2) {
            if (nums1.contains(num)) {
                result.add(num);
            }
        }
        int[] intersection = new int[result.size()];
        int i = 0;
        for (int num : result) {
            intersection[i++] = num;
        }
        return intersection;
    }
}