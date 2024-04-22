package src.OOPS_09;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the name");
        String name = sc.next();

        Person p = new Person(name);
        new Person();

        Person p2= new Person(" Alak");
        p2.printdetail();

        Person p3= new Person(" Vijay");
        p3.printdetail();
        p.printdetail();



    }
}
