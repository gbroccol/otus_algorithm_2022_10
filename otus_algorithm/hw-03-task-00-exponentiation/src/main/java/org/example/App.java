package org.example;

/**
 * Реализовать алгоритмы возведения числа в степень
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("2 ^ 2 = " + Case1Iterative.pow(2, 2));
        System.out.println("2 ^ 3 = " + Case1Iterative.pow(2, 3));
        System.out.println("3 ^ 2 = " + Case1Iterative.pow(3, 2));
        System.out.println("3 ^ 3 = " + Case1Iterative.pow(3, 3));
    }
}
