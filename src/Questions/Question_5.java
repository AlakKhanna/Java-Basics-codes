package src.Questions;

import java.util.Scanner;
public class Question_5 {
    public static void main(String[] args)
    {
        //Write a program that calculates and displays the letter grade for a
        // given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter the number, I will share the grade");
        int number= sc.nextInt();

        if (number>=90 && number <=100)
        {
            System.out.println(" your grade is A " + number);
        }
        else if (number>=80 && number <=89)
        {
            System.out.println(" your grade is B " + number);
        }
        else if (number>=70 && number <=79)
        {
            System.out.println(" your grade is 'c' " + number);
        }
        else if (number>=60 && number <=69)
        {
            System.out.println(" your grade is D " + number);
        }
        else
        {
            System.out.println(" your grad eis 'F' " + number);
        }


    }
}
