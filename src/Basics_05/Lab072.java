package src.Basics_05;

import java.util.Scanner;

public class Lab072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number & i will tell you it is prime or not");
        int num = sc.nextInt();

        sc.close();

        if (num / num == 1)
        {
            System.out.println("this is not the prime number");
        }
        else
        {
            System.out.println("this is a prime number");
        }
    }
}
