public class Solution {
    public int numSetBits(long a) {

        String str = Long.toBinaryString(a);
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                counter++;
            }
        }
        return counter;
    }
}
