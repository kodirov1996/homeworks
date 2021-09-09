package com.example.template;

public class ThousandSeparator {

    public String thousandSeparator(int n) {
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        int j = 0;

        if (n > Math.pow(2, 31) && n <= 0) {
            return sb.append("0").toString();
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (j == 3) {
                sb.append(".");
                j = 0;
            }
            j++;
            sb.append(s.charAt(i));
        }
        return sb.reverse().toString();

    }

}
