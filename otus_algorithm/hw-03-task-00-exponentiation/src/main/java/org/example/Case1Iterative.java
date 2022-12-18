package org.example;

/**
 * Реализовать итеративный O(N) алгоритм возведения числа в степень
 *
 */

public class Case1Iterative {

    public static double pow(double base, double exponent) {

        if (exponent == 0)
            return 1;

        double power = 1;
        for (int i = 0; i < exponent; i++) {
            power = power * base;
        }
        return round(power, 11);
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
