package src.Basics_04;

import java.util.Scanner;

public class Lab043 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enetr your marks, i will share the grade");
        int marks = sc.nextInt();
        
        if (marks>=90 && marks <=100)
        {
            System.out.println(" Your grade is A");
        }
        else if ( marks >=89 & marks<=80)
        {
            System.out.println(" Your grade is B");
        }
        else if ( marks >=70 && marks <=79  )
        {
            System.out.println(" Your grade is C");
        }
        else if ( marks>=60 && marks <=69 )
        {
            System.out.println(" Your grade is D");
        }
        else
        {
            System.out.println(" You are fail");
        }


    }
}
