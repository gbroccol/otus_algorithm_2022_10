package org.example;

import org.example.util.SumStrings;

/**
 * Реализовать итеративный O(N) алгоритм поиска чисел Фибоначчи.
 *
 */

public class FindFibonacciIterative {

    public static String find(Integer position) {

        if (position == 0 || position == 1)
            return position.toString();

        if (position > 10)
            return findBigNumber(position);

        long pre1;
        long pre2 = 1;

        long currentNumber = 1;

        for (int currentPosition = 2; currentPosition < position; currentPosition++) {

            pre1 = pre2;
            pre2 = currentNumber;
            currentNumber = pre1 + pre2;

        }

        return ((Long) currentNumber).toString();
    }

    private static String findBigNumber(int position) {

        String pre1Number;
        String pre2Number = "34";

        String currentNumber = "55";

        for (int currentPosition = 10; currentPosition < position; currentPosition++) {

            pre1Number = pre2Number;
            pre2Number = currentNumber;
            currentNumber = SumStrings.sumStrings(pre1Number, pre2Number);

        }

        return currentNumber;
    }
}
