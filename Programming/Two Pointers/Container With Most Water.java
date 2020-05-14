public class Solution {
    public int maxArea(ArrayList<Integer> A) {

        int len = A.size();
        if (len <= 1) {
            return 0;
        }

        int start = 0, end = len - 1, area = 0;

        while (start < end) {

            area = Math.max((end - start) * (Math.min(A.get(start), A.get(end))), area);

            if (A.get(start) <= A.get(end)) {
                start++;
            } else {
                end--;
            }

        }

        return area;

    }
}
