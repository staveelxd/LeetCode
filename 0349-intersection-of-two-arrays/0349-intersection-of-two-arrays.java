class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int num: arr1) {
            set.add(num);
        }
        for (int num: arr2) {
            if(set.contains(num)) {
                res.add(num);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}