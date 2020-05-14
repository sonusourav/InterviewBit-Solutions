public class Solution {
    public int[] wave(int[] A) {

        Arrays.sort(A);
        int size = A.length;
        int temp = 0;

        for (int i = 0; i < size; i += 2) {
            if (size % 2 != 0 && i == size - 1) {
                break;
            } else {
                temp = A[i];
                A[i] = A[i + 1];
                A[i + 1] = temp;
            }

        }

        return A;
    }
}
