package org.example.util;

public class SumStrings {

//    private static Integer

    public static String sumStrings(String x, String y) {

        StringBuilder result = new StringBuilder(x.length());

        char[] xChars = x.toCharArray();
        char[] yChars = y.toCharArray();

        int xPosition = x.length() - 1;

        int residue = 0;

        for (int yPosition = y.length() - 1; yPosition >= 0; yPosition--) {

            int xChar = xPosition < 0 ? 0 : xChars[xPosition] - '0';
            int yChar = yChars[yPosition] - '0';

            int sum = xChar + yChar + residue;

            if (sum > 9) {
                residue = 1;
                sum = sum - 10;
            } else {
                residue = 0;
            }
            result.append(sum);
            xPosition--;
        }

        if (residue > 0) {
            result.append(residue);
        }

        return result.reverse().toString();
    }
}
