public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            arr.add(Integer.toString(A[i]));
        }

        Collections.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        StringBuilder str = new StringBuilder("");

        for (int i = 0; i < arr.size(); i++) {
            str = str.append(arr.get(i));
        }

        if (str.charAt(0) == '0') {
            return "0";
        } else
            return str.toString();

    }
}