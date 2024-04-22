package src.OOPS_07;

import java.util.Scanner;

public class Lab100 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int reminder;
        int number = input;
        int sum = 0;

        for (int i =1; i<input; i++)
        {
            reminder = input/100;
            sum = sum *10 +reminder;
            input = input/10;
        }
    }
}
