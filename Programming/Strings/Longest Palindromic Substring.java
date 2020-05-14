public class Solution {
    public String longestPalindrome(String A) {

        int size = A.length();
        StringBuilder str = new StringBuilder();
        StringBuilder max_str = new StringBuilder();
        StringBuilder fin_str = new StringBuilder();
        boolean test = true;
        max_str.setLength(0);
        int j = 0;
        int even_len = 0, odd_len = 0;

        max_str.append(A.charAt(0));
        fin_str.append(max_str);
        odd_len = 1;

        for (int i = 1; i < (2 * size - 2); i++) {
            test = true;
            str.setLength(0);
            if (i % 2 == 0) {
                j = 0;

                str.append(A.charAt(i / 2));

                while (test) {
                    if (A.charAt((i - j) / 2 - 1) == A.charAt((i + j) / 2 + 1)) {
                        str.append(A.charAt((i - j) / 2 - 1));

                        j = j + 2;
                        if (((i + j) / 2 + 1) >= A.length() || ((i - j) / 2 - 1) < 0) {
                            test = false;
                            if (str.length() > odd_len && str.length() > even_len) {
                                max_str.setLength(0);
                                max_str.append(str.toString());
                                max_str.reverse();
                                odd_len = max_str.length();
                                str.setLength(0);
                                fin_str.setLength(0);
                                fin_str.append(max_str);
                                for (int k = 1; k < odd_len; k++) {
                                    fin_str.append(max_str.toString().charAt(odd_len - k - 1));
                                }
                                max_str.reverse();
                            }
                        }
                    } else {
                        if (str.length() > odd_len && str.length() > even_len) {
                            max_str.setLength(0);
                            max_str.append(str.toString());
                            str.setLength(0);
                            max_str.reverse();
                            odd_len = max_str.length();
                            fin_str.setLength(0);
                            fin_str.append(max_str);
                            for (int k = 1; k < odd_len; k++) {
                                fin_str.append(max_str.toString().charAt(odd_len - k - 1));
                            }
                        }
                        max_str.reverse();
                        test = false;
                        j = 0;
                    }
                }
            } else {
                j = 0;

                while (test) {

                    if (A.charAt((i - j - 1) / 2) == A.charAt((i + j + 1) / 2)) {
                        str.append(A.charAt(((i - j - 1) / 2)));

                        j = j + 2;
                        if ((i + j + 1) / 2 >= A.length() || (i - j - 1) / 2 < 0) {
                            test = false;
                            if (str.length() > even_len && str.length() > odd_len - 1) {
                                max_str.setLength(0);
                                max_str.append(str.toString());
                                str.setLength(0);
                                max_str.reverse();
                                even_len = max_str.length();
                                fin_str.setLength(0);
                                fin_str.append(max_str);
                                for (int k = 0; k < even_len; k++) {
                                    fin_str.append(max_str.toString().charAt(even_len - k - 1));
                                }
                                max_str.reverse();

                            }
                        }
                    } else {
                        if (str.length() > even_len && str.length() > odd_len - 1) {
                            max_str.setLength(0);
                            max_str.append(str.toString());
                            str.setLength(0);
                            max_str.reverse();
                            even_len = max_str.length();
                            fin_str.setLength(0);
                            fin_str.append(max_str);
                            for (int k = 0; k < even_len; k++) {
                                fin_str.append(max_str.toString().charAt(even_len - k - 1));
                            }
                            max_str.reverse();
                        }
                        test = false;
                        j = 0;
                    }
                }

            }
        }

        return fin_str.toString();
    }
}
