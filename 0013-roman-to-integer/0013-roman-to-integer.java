class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = dict.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? dict.get(s.charAt(i + 1)) : 0;
            if (cur < next) {
                res -= cur;
            } else {
                res += cur;
            }
        }
        return res;
    }
}