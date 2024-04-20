package src.Basics_06;

import java.util.Scanner;

public class Lab087 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int [5];
        System.out.println("Enter the first subject");
        marks[0]= sc.nextInt();
        System.out.println("Enter the second subject");
        marks[1]= sc.nextInt();
        System.out.println("Enter the third subject");
        marks[2]= sc.nextInt();
        System.out.println("Enter the fourth subject");
        marks[3]= sc.nextInt();
        System.out.println("Enter the fifth subject");
        marks[4]= sc.nextInt();

        sc.close();

        for (int results: marks)
        {
            System.out.println(results);
        }



    }

}
