package src.Questions;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args)
    {
        //Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the year here: ");
        int year = sc.nextInt();

        if (year%4==0 && year%100 !=0 || year%400 ==0)
        {
            System.out.println(" This is the Leap Year : " + year);
        }
        else
        {
         System.out.println("This is not a leap year " + year);
        }


    }
}
