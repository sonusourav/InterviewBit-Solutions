public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {

        if (a == null || a.size() == 0)
            return 0;

        int i = 1;
        int val = a.get(0);
        for (int k = 1; k < a.size(); k++) {
            if (val != a.get(k)) {
                val = a.get(k);
                int tmp = a.get(i);
                a.set(i, val);
                a.set(k, tmp);
                i++;
            }
        }

        return i;
    }
}
