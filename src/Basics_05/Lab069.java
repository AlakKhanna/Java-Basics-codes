package src.Basics_05;

import java.util.Scanner;

public class Lab069 {

    public static void main(String[] args) {

        //factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number");
        int num = sc.nextInt();
        long fact =1;
        sc.close();

        for (int i =1; i<=num; i++)
            fact = fact*i;
            System.out.println(fact);

    }
}
