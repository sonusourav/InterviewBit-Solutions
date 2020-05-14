public class Solution {
    public int findMinXor(int[] A) {

        if (A.length < 2) {
            return 0;
        }

        Arrays.sort(A);
        int min = A[0] ^ A[1];

        for (int i = 1; i < A.length - 1; i++) {

            if ((A[i] ^ A[i + 1]) < min) {
                min = A[i] ^ A[i + 1];
            }

        }

        return min;
    }

}
