package src.Basics_04;

import java.util.Scanner;

public class Lab046 {
    public static void main(String[] args) {
        //switch condition

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number, i will tell you which day it is");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid date");
        }

        System.out.println("--End of the Program--");

    }
}
