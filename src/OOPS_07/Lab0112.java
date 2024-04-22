package src.OOPS_07;

import java.util.Scanner;

public class Lab0112 {

    public static void main(String[] args) {

        int flag =0;
        int m = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here");
        int n = sc.nextInt();
        m =n/2;

        if (n==0 || n==1)
        {
            System.out.println("not a prime number " + n);
        }
        else
        {
            for (int i =2; i<=m; i++ )
            {
                if (n%i==0)
                {
                    System.out.println("not a prime number " + n);
                    flag =1;
                    break;
                }
            }
        }

        if (flag ==0)
        {
            System.out.println("this is a prime number " + n);
        }
    }
}
