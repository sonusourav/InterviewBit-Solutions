public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int b[] = new int[A.length];

        if (A.length < 1) {
            return 0;
        } else if (A.length == 1) {
            return A[0];
        } else {
            System.arraycopy(A, 0, b, 0, A.length);
            Arrays.sort(b);
            int i = 0;
            while (i < A.length - 1) {
                if (b[i] == b[i + 1]) {
                    i = i + 3;
                } else {
                    return b[i];
                }
            }
        }
        return b[A.length - 1];
    }
}
