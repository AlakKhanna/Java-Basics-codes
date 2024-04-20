package src.Basics_05;

import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year");
        long year = sc.nextLong();

        if (year%4==0 && (!(year%100==0)))
        {
            System.out.println("This is the leap year " + year);
        }
        else
        {
            System.out.println("This is not the leap year " + year);
        }
        sc.close();
    }
}
