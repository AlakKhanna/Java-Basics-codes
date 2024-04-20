package src.Basics_03;

import java.util.Scanner;

public class Lab040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter your number i will tell it is odd or even");
        int a = sc.nextInt();

        if (a%2 ==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }
}
