package org.example;

/**
 * Реализовать алгоритм поиска количества простых чисел через перебор делителей, O(N^2).
 *
 */

public class CountPrimeNumbers {

    public static int getNumberOfPrimeNumbers(int to) {

        int count = 0;

        for (int number = 1; number <= to; number++) {
            if (isPrime(number))
                count++;
        }
        return count;
    }

    private static boolean isPrime(int number) {

        if (number == 1)
            return false;

        if (number == 2)
            return true;

        if (number % 2 == 0)
            return false;

        for (int i = 3; i < number / 2; i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
