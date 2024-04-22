package src.OOPS_07;

import java.util.Scanner;

public class TakeInputAsArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();


        int number[]= new int[size];
        System.out.println("enter the elements");


        for (int i = 0; i<size; i++)
        {
            number[i] = sc.nextInt();
        }

        for (int output: number)
        {
            System.out.println(output);
        }
    }
}
