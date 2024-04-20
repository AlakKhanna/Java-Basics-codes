package src.Basics_04;

import java.util.Scanner;

public class Lab045 {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        System.out.println("enter the first side length");
        int side1 = sc.nextInt();

        System.out.println("enter the second side length");
        int side2 = sc.nextInt();

        System.out.println("enter the third side length");
        int side3 = sc.nextInt();
        
        if ((side1==side2) && (side1==side3))
        {
            System.out.println("Triangle is equilateral");
        }
        else if ((side1==side2) || (side1==side3))
        {
            System.out.println("Triangle is isosceles");
        }
        else
        {
            System.out.println("Triangle is scalene");
        }


    }
}
