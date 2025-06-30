class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
    Map <Character, Integer> s1Count = new HashMap<>();
    Map <Character, Integer> window = new HashMap<>();
    for (char c : s1.toCharArray()) {
        s1Count.put(c, s1Count.getOrDefault(c, 0) + 1);
    }
    int windowSize = s1.length();
    for (int i = 0; i < s2.length(); i++) {
        char symbol = s2.charAt(i);
        window.put(symbol, window.getOrDefault(symbol, 0) + 1);
        if (i >= windowSize) {
            char toRemove = s2.charAt(i - windowSize);
            if (window.get(toRemove) == 1) {
                window.remove(toRemove);
            } else {
                window.put(toRemove, window.get(toRemove) - 1);
            }
        }
        if (window.equals(s1Count)) {
            return true;
        }
    }
    return false;
    }
}