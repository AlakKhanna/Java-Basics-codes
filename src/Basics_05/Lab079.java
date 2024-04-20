package src.Basics_05;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number, and know it is prime or not");
        int num = sc.nextInt();
        int temp =0;
        sc.close();

        for (int i =2; i< num/2; i++)
        {
            if (num%2 ==0)
            {
                temp = 1;
                break;
            }
        }
        if (temp == 0)
        {
            System.out.println(num + " Number is prime");
        }
        else {
            System.out.println(num + " Number is not prime");
        }


    }
}
