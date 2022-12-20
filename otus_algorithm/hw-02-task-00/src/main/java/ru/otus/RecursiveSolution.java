package ru.otus;

public class RecursiveSolution {

    private static int count = 0;

    public static int solve(int size) {
        count = 0;
        solve(size, 0, 0);
        return count;
    }

    private static void solve(int n, int sumA, int sumB) {
        if (n == 0) {
            if (sumA == sumB) {
                count++;
            }
            return;
        }

        for (int a = 0; a <=9; a++) { // 10 раз
            for (int b = 0; b <=9; b++) { // 10 раз
                // Сложность 100 ^ n
                solve(n - 1, sumA + a, sumB + b);
            }
        }
    }
}
