package src.Basics_06;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];


        for (int i =0; i<marks.length; i++)
        {
            System.out.println("Enter your marks here");
            marks[i]= sc.nextInt();
        }

        for (int i =0; i<marks.length; i++)
        {
            System.out.print(marks[i] + " , ");
        }



    }
}
