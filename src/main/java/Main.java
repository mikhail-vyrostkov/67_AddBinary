public class Main {
    public static void main(String[] args) {
        String a = "100";
        String b = "110010";
        System.out.println(Solution.addBinary(a, b));
    }

    public static class Solution {
        public static String addBinary(String a, String b) {
            int k = 0;
            StringBuilder sb = new StringBuilder();
            int size = 0;

            if (a.length() > b.length()) {
                size = b.length();
            } else if (a.length() < b.length()) {
                size = a.length();
            }
            for (int i = 0; i < size; i++) {

                if (a.charAt(a.length() - 1 - i) == '1' && b.charAt(b.length() - 1 - i) == '1' && k == 0) {
                    sb.append('0');
                    k = 1;
                } else if (a.charAt(a.length() - 1 - i) == '1' && b.charAt(b.length() - 1 - i) == '1' && k == 1) {
                    sb.append('1');
                    k = 1;
                } else if (a.charAt(a.length() - 1 - i) == '0' && b.charAt(b.length() - 1 - i) == '1' && k == 0) {
                    sb.append('1');
                    k = 0;
                } else if (a.charAt(a.length() - 1 - i) == '1' && b.charAt(b.length() - 1 - i) == '0' && k == 0) {
                    sb.append('1');
                    k = 0;
                } else if (a.charAt(a.length() - 1 - i) == '0' && b.charAt(b.length() - 1 - i) == '1' && k == 1) {
                    sb.append('0');
                    k = 1;
                } else if (a.charAt(a.length() - 1 - i) == '1' && b.charAt(b.length() - 1 - i) == '0' && k == 1) {
                    sb.append('0');
                    k = 1;
                } else if (a.charAt(a.length() - 1 - i) == '0' && b.charAt(b.length() - 1 - i) == '0' && k == 0) {
                    sb.append('0');
                    k = 0;
                } else if (a.charAt(a.length() - 1 - i) == '0' && b.charAt(b.length() - 1 - i) == '0' && k == 1) {
                    sb.append('1');
                    k = 0;
                }
            }
            if (a.length() > b.length()) {
                size = b.length();
                for (int i = (a.length() - size) - 1; i >= 0; i--) {

                    if (a.charAt(i) == '1' && i != 0 && k == 0) {
                        sb.append('1');
                        k = 0;
                    } else if (a.charAt(i) == '1' && i != 0 && k == 1) {
                        sb.append('0');
                        k = 1;
                    } else if (a.charAt(i) == '0' && i != 0 && k == 1) {
                        sb.append('1');
                        k = 0;
                    } else if (a.charAt(i) == '0' && i != 0 && k == 0) {
                        sb.append('0');
                        k = 0;
                    } else if (a.charAt(i) == '1' && i == 0 && k == 0) {
                        sb.append('1');
                    } else if (a.charAt(i) == '1' && i == 0 && k == 1) {
                        sb.append('0');
                        sb.append('1');
                    }
                }
            } else if (a.length() < b.length()) {
                size = a.length();
                for (int i = (b.length() - size) - 1; i >= 0; i--) {

                    if (b.charAt(i) == '1' && i != 0 && k == 0) {
                        sb.append('1');
                        k = 0;
                    } else if (b.charAt(i) == '1' && i != 0 && k == 1) {
                        sb.append('0');
                        k = 1;
                    } else if (b.charAt(i) == '0' && i != 0 && k == 1) {
                        sb.append('1');
                        k = 0;
                    } else if (b.charAt(i) == '0' && i != 0 && k == 0) {
                        sb.append('0');
                        k = 0;
                    } else if (b.charAt(i) == '1' && i == 0 && k == 0) {
                        sb.append('1');
                    } else if (b.charAt(i) == '1' && i == 0 && k == 1) {
                        sb.append('0');
                        sb.append('1');
                    }
                }
            }

            if (a.length() == b.length()) {
                size = a.length();
                for (int i = size - 1; i >= 0; i--) {

                    if (b.charAt(i) == '1' && a.charAt(i) == '1' && i != 0 && k == 0) {
                        sb.append('0');
                        k = 1;
                    } else if (b.charAt(i) == '1' && a.charAt(i) == '1' && i != 0 && k == 1) {
                        sb.append('1');
                        k = 1;
                    } else if (a.charAt(i) == '0' && b.charAt(i) == '1' && i != 0 && k == 0) {
                        sb.append('1');
                        k = 0;
                    } else if (a.charAt(i) == '1' && b.charAt(i) == '0' && i != 0 && k == 0) {
                        sb.append('1');
                        k = 0;
                    } else if (a.charAt(i) == '0' && b.charAt(i) == '1' && i != 0 && k == 1) {
                        sb.append('0');
                        k = 1;
                    } else if (a.charAt(i) == '1' && b.charAt(i) == '0' && i != 0 && k == 1) {
                        sb.append('0');
                        k = 1;
                    } else if (b.charAt(i) == '0' && a.charAt(i) == '0' && i != 0 && k == 0) {
                        sb.append('0');
                        k = 0;
                    } else if (b.charAt(i) == '0' && a.charAt(i) == '0' && i != 0 && k == 1) {
                        sb.append('1');
                        k = 0;
                    } else if (b.charAt(i) == '0' && a.charAt(i) == '0' && i == 0 && k == 0) {
                        sb.append('0');
                        k = 0;
                    } else if (b.charAt(i) == '1' && a.charAt(i) == '0' && i == 0 && k == 0) {
                        sb.append('1');
                        k = 0;
                    } else if (b.charAt(i) == '0' && a.charAt(i) == '1' && i == 0 && k == 0) {
                        sb.append('1');
                        k = 0;
                    } else if (b.charAt(i) == '1' && a.charAt(i) == '1' && i == 0 && k == 0) {
                        sb.append('0');
                        sb.append('1');
                    } else if (b.charAt(i) == '1' && a.charAt(i) == '1' && i == 0 && k == 1) {
                        sb.append('1');
                        sb.append('1');
                    }
                }
            }
            return sb.reverse().toString();
        }
    }
}
