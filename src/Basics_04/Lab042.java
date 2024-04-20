package src.Basics_04;

import java.util.Scanner;

public class Lab042 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>20)
        {
            System.out.println("Number is greater than 20");
        } else if (num>10)
        {
            System.out.println("number is greater than 10");
        }
        else
        {
            System.out.println("number is less than 20");
        }
    }
}
