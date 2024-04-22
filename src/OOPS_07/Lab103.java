package src.OOPS_07;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter your first number");
        int first_no= sc.nextInt();
        System.out.println("eneter your second number");
        int second_no= sc.nextInt();

        first_no = first_no * second_no;
        second_no = first_no/ second_no;
        first_no = first_no/ second_no;

        System.out.println("Value of both input " + first_no + " , " + second_no);
    }
}
