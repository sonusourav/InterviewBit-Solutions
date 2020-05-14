public class Solution {
    public String[] fullJustify(String[] A, int B) {

        int counter_w = 0, counter_s = 0, counter = 0, i = 0, index = 0, extra_s = 0, space = 0;
        ArrayList<String> ans = new ArrayList<String>();

        if (A.length > 0) {
            StringBuilder str = new StringBuilder("");

            while (counter_w < A.length) {
                counter_s = 0;
                counter = 0;
                extra_s = 0;
                i = 0;
                str.setLength(0);

                while (counter < B && counter_w < A.length) {
                    if ((counter + A[counter_w].length()) <= B) {
                        counter = counter + A[counter_w].length() + 1;
                        counter_w++;
                        i++;
                    } else
                        break;

                }

                counter_s = B - counter + i;

                if (i > 1) {
                    extra_s = counter_s - ((counter_s / (i - 1)) * (i - 1));
                    space = (counter_s / (i - 1));
                } else {
                    extra_s = counter_s;
                }

                for (int k = i; k > 0; k--) {
                    if (counter_w == A.length) {

                        if (k == i) {
                            str.append(A[counter_w - k]);
                            index++;
                        } else {
                            str.append(" ");
                            str.append(A[counter_w - k]);
                            index++;
                        }
                    } else {
                        if (k == i) {
                            str.append(A[counter_w - k]);
                            index++;
                        } else {
                            for (int s = 0; s < space; s++)
                                str.append(" ");
                            if (extra_s > 0) {
                                str.append(" ");
                                extra_s--;
                            }
                            str.append(A[counter_w - k]);
                            index++;
                        }
                    }

                }

                if (counter_w == A.length || i == 1) {
                    String ex_str = str.toString();
                    ans.add(String.format("%-" + B + "s", ex_str));
                } else
                    ans.add(str.toString());
            }

        }
        String fin_ans[] = ans.toArray(new String[ans.size()]);
        return fin_ans;
    }
}
