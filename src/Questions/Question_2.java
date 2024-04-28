package src.Questions;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        //Print  lines of output; each line  (where ) contains the  of  in the form:
        //N x i = result.

        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter your number, I will print the whole table: ");
        int table= sc.nextInt();

        for (int i =1; i<= 10; i++)
        {
            System.out.println(table + " X " + i + " = " + table * i );

        }


    }
}
