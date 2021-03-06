public class Solution {
    public int pow(int x, int n, int d) {
        int A = x, B = n, C = d;
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;

        // If B is even
        long y;
        if (B % 2 == 0) {
            y = pow(A, B / 2, C);
            y = (y * y) % C;
        }

        // If B is odd
        else {
            y = A % C;
            y = (y * pow(A, B - 1, C) % C) % C;
        }

        return (int) ((y + C) % C);
    }
}
