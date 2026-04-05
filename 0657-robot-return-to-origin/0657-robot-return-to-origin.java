class Solution {
    public boolean judgeCircle(String moves) {
        int[] pos = {0, 0};
        for(char c : moves.toCharArray()) {
            switch(c) {
                case 'U' -> pos[1]++;
                case 'R' -> pos[0]++;
                case 'L' -> pos[0]--;
                case 'D' -> pos[1]--;
            }
        }
        return pos[0] == 0 && pos[1] == 0;
    }
}