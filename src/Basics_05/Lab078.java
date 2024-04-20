package src.Basics_05;

import java.util.Scanner;

public class Lab078 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you number & I will reverse it");
        int n = sc.nextInt();
        int num = n;
        int sum= 0;

        while (n!=0)
        {
             int rem = n%10;
             sum = sum * 10 + rem;
             n = n/10;
        }
         System.out.println(" Reverse of " + num + ": " + sum);
    }
}
