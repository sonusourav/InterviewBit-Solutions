public class Solution {
    public String[] restoreIpAddresses(String A) {
        boolean flag = true;
        ArrayList<String> addresses = new ArrayList<String>();
        StringBuilder address = new StringBuilder();
        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();
        StringBuilder temp3 = new StringBuilder();
        StringBuilder temp4 = new StringBuilder();

        int size = A.length();

        if (size < 4 || size > 12) {
            return (new String[] {});
        }

        for (int counter1 = 1; counter1 < 4; counter1++) {
            temp1.setLength(0);
            address.setLength(0);
            temp1.append(A.substring(0, counter1));

            if (temp1.charAt(0) == '0' && counter1 != 1) {
                continue;
            }

            if (Integer.parseInt(temp1.toString()) > 255) {
                continue;
            } else {

                for (int counter2 = 1; counter2 < 4; counter2++) {

                    // loop2 logic
                    temp2.setLength(0);
                    if (counter1 + counter2 > size)
                        continue;
                    else
                        temp2.append(A.substring(counter1, counter2 + counter1));

                    if (temp2.charAt(0) == '0' && counter2 != 1) {
                        continue;
                    }

                    if (Integer.parseInt(temp2.toString()) > 255) {
                        continue;
                    } else {

                        for (int counter3 = 1; counter3 < 4; counter3++) {
                            temp3.setLength(0);

                            // loop3 logic
                            if (counter1 + counter2 + counter3 > size)
                                continue;
                            else
                                temp3.append(A.substring(counter1 + counter2, counter1 + counter2 + counter3));

                            if (temp3.charAt(0) == '0' && counter3 != 1) {
                                continue;
                            }

                            if (Integer.parseInt(temp3.toString()) > 255) {
                                continue;
                            } else {

                                // loop4 logic
                                temp4.setLength(0);
                                temp4.append(A.substring(counter1 + counter2 + counter3, A.length()));

                                if (temp4.toString().equals("") || temp4.toString().length() == 0) {
                                    continue;
                                }

                                if (temp4.charAt(0) == '0' && temp4.length() != 1) {
                                    continue;
                                }

                                if (Integer.parseInt(temp4.toString()) > 255) {
                                    continue;
                                } else {
                                    address.setLength(0);
                                    address.append(temp1);
                                    address.append(".");
                                    address.append(temp2);
                                    address.append(".");
                                    address.append(temp3);
                                    address.append(".");
                                    address.append(temp4);
                                    addresses.add(address.toString());
                                    address.setLength(0);
                                }
                            }
                        }
                    }

                }
            }
        }

        String[] array = addresses.toArray(new String[addresses.size()]);
        return array;
    }
}
