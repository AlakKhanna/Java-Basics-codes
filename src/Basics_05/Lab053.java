package src.Basics_05;

import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = sc.next();

        System.out.println("enter your age: ");
        int age = sc.nextInt();

        System.out.println("enetr your salary: ");
        double salary = sc.nextDouble();
        sc.close();

        System.out.println(name + " " + age + " " + salary);
    }
}
