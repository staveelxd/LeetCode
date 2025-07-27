class Solution {
    public int[] plusOne(int[] digits) {
        boolean allNines = true;
        for (int digit : digits) {
            if (digit != 9) {
                allNines = false;
                break;
            }
        }
        if (allNines) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = 0;
            }
            return result;
        } else {
            int[] result = new int[digits.length];
            boolean add = true;
            for (int i = result.length - 1; i >= 0; i--) {
                if (digits[i] == 9 && add) {
                    result[i] = 0;
                } else {
                    if (add) {
                        result[i] = digits[i] + 1;
                        add = false;
                    } else {
                        result[i] = digits[i];
                    }
                   
                }
            }
            return result;
        }
    }
}