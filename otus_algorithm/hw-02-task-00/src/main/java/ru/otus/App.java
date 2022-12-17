package ru.otus;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Ticket length = 2, lucky tickets = " + FinalSolution.fillDigitSum(1)); // 10
        System.out.println( "Ticket length = 4, lucky tickets = " + FinalSolution.fillDigitSum(2)); // 670
        System.out.println( "Ticket length = 6, lucky tickets = " + FinalSolution.fillDigitSum(3)); // 55252
        System.out.println( "Ticket length = 8, lucky tickets = " + FinalSolution.fillDigitSum(4)); // 4816030
        System.out.println( "Ticket length = 10, lucky tickets = " + FinalSolution.fillDigitSum(5)); // 432457640
    }

}
