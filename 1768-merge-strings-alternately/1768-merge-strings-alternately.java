class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int p = 0;
        while (p < word1.length() || p < word2.length()) {
            if (p < word1.length()) {
                result.append(word1.charAt(p));
            }
            if (p < word2.length()) {
                result.append(word2.charAt(p));
            }
            p++;
        }
        return result.toString();
    }
}