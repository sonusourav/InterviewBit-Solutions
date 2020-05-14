public class Solution {
    public String solve(String A) {

        ArrayList<String> strList = new ArrayList<String>();
        A = A.trim();
        int len = A.length(), i = 0, j = 0;
        StringBuilder str = new StringBuilder();

        while (i + j < len) {
            str.setLength(0);
            str.append(A.charAt(i));
            j++;
            if (i + j >= len) {
                System.out.print(str.toString());
                strList.add(str.toString());
                break;
            }
            while (A.charAt(i + j) != ' ') {
                str.append(A.charAt(i + j));
                j++;
                if (i + j >= len) {
                    break;
                }
            }
            strList.add(str.toString());
            System.out.print(str.toString() + " ");
            i = i + j;
            j = 0;
        }

        str.setLength(0);
        for (int k = 0; k < strList.size(); k++) {
            str.append(strList.get(strList.size() - k - 1));

        }

        return str.toString().trim();

    }
}
