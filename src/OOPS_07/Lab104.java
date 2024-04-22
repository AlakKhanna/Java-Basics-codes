package src.OOPS_07;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number []= new int[3];
        for (int i =0; i<number.length; i++)
        {
            System.out.println("enter your number");
            number[0]=sc.nextInt();
            System.out.println("enter your number");
            number[1]= sc.nextInt();
            System.out.println("enter your number");
            number[2]= sc.nextInt();

            for (int input : number)
            {
                System.out.println(input);
            }

        }
    }
}
