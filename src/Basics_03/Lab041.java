package src.Basics_03;

import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        System.out.println("Enter your third number");
        int c = sc.nextInt();

        if (a>b && a>c)
        {
            System.out.println("First number is bigger- " + a);
        }
        else if (b>a && b>c)
        {
            System.out.println("Second number is bigger- " + b);
        }
        else
        {
            System.out.println("Third number is bigger " + c);
        }

    }
}
