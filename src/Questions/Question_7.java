package src.Questions;

import java.util.Scanner;
public class Question_7 {

    public static void main (String[] args)
    {
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal). Use an if-else statement to classify the triangle.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value here ");
        int first_no= sc.nextInt();
        System.out.println("Enter the second value here ");
        int second_no= sc.nextInt();
        System.out.println("Enter the third value here ");
        int third_no= sc.nextInt();

        if ( first_no== second_no && second_no == third_no)
        {
            System.out.println("the triangle is equilateral (all sides are equal)");
        }
        else if ( first_no ==second_no || second_no == third_no || first_no == third_no)
        {
            System.out.println("the triangle is isosceles (exactly two sides are equal) ");
        }
        else
        {
            System.out.println("The triangle is scalene (no sides are equal)");
        }


    }
}
