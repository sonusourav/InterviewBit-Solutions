public class Solution {
    public int firstMissingPositive(int[] A) {

        Arrays.sort(A);
        int size = A.length, index = 0;
        boolean first_pos = true;

        for (int i = 0; i < size; i++) {
            index = i;
            if (A[i] <= 0) {
                continue;
            } else {
                if (first_pos && A[i] != 1) {
                    first_pos = false;
                    return 1;
                } else {
                    if (i != size - 1) {
                        if (A[i + 1] == A[i] + 1) {
                            first_pos = false;
                            continue;
                        } else {
                            first_pos = false;
                            return A[i] + 1;
                        }
                    } else {
                        first_pos = false;
                        return A[i] + 1;
                    }
                }
            }
        }

        if (A[index] < 1)
            return 1;
        else
            return A[index] + 1;
    }
}
