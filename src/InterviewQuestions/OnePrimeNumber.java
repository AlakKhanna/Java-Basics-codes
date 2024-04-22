package src.InterviewQuestions;

import java.util.Scanner;

public class OnePrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here");
        int number = sc.nextInt();
        int m = number/2;
        int flag =0;

        if (number ==0 || number == 1)
        {
            System.out.println("This is not a prime number" + number);
        }
        else
        {
            for (int i =2; i<=m; i++)
            {
                if ( number % i == 0)
                {
                    System.out.println(" this is not a prime number " + number);
                    flag = 1;
                    break;
                }
            }
        }
        if (flag ==0)
        {
            System.out.println("This is a prime number " + number);
        }

    }
}
