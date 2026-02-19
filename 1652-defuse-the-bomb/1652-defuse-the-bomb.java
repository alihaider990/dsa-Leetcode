class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result;   
        }

        for (int i = 0; i < n; i++) {
            int total = 0;

            for (int j = 1; j <= Math.abs(k); j++) {
                if (k > 0) {
                    total += code[(i + j) % n];
                } else {
                    total += code[(i - j + n) % n];
                }
            }

            result[i] = total;
        }

        return result;
    }
}
