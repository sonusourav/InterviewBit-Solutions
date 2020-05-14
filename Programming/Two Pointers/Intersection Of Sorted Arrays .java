public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] intersect(final int[] A, final int[] B) {

        int max = Math.min(A[(A.length) - 1], B[(B.length) - 1]);
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while (A[i] <= max || B[j] <= max) {
            if (A[i] == B[j]) {
                ans.add(A[i]);
                if (i < A.length - 1 && j < B.length - 1) {
                    i++;
                    j++;

                } else {
                    break;
                }

            } else if (A[i] > B[j]) {
                if (j < B.length - 1) {
                    j++;

                } else {
                    break;
                }
            } else {
                if (i < A.length - 1) {
                    i++;
                } else {
                    break;
                }
            }
        }
        return ans.stream().mapToInt(k -> k).toArray();

    }

    public static int find(int[] a, int target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;

        return -1;
    }
}
