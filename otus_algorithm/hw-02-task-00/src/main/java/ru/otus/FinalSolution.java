package ru.otus;

public class FinalSolution {

    private static Long count;
    private static int[] digitsSum;

    public static long fillDigitSum(Integer n) {

        count = 0l;

        int maxDigitsSum = 9 * n + 1;
        digitsSum = new int[maxDigitsSum];

        fillDigitSum(n, 0);

        for (int i = 0; i < maxDigitsSum; i++) {
            count += (long) digitsSum[i] * digitsSum[i];
        }

        return count;
    }

    private static void fillDigitSum(int n, int sum) {
        for (int i = 0; i <= 9; i++) {
            if (n == 1) {
                digitsSum[sum + i]++;
            } else {
                fillDigitSum(n - 1, sum + i);
            }
        }
    }
}
