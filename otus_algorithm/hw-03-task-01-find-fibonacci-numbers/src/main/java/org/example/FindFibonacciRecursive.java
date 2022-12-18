package org.example;

import org.example.util.SumStrings;

/**
 * Реализовать рекурсивный O(2^N) алгоритм поиска чисел Фибоначчи.
 *
 */

public class FindFibonacciRecursive {

    public static String find(Integer position) {

        if (position == 0 || position == 1)
            return position.toString();

        return SumStrings.sumStrings(find(position - 1), find(position - 2));
    }
}
