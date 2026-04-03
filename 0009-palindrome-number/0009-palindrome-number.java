class Solution {
    public boolean isPalindrome(int x) {
        int mirror = 0, expected = x;
        while (x > 0) {
            mirror = mirror*10 + x % 10;
            x /= 10;
        }
        System.out.println(mirror);
        return mirror == expected;
    }
}