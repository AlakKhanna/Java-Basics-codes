package src.InterviewQuestions;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here");
        int n = sc.nextInt();
        int number = n;
        int sum= 0;

        while (n !=0)
        {
            int rem = n%10;
            sum = sum *10 + rem;
            n = n/10;

        }
        System.out.println(" reminder of " + n + " : " + sum);
    }
}
