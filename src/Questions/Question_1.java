package src.Questions;

import java.util.Scanner;
public class Question_1 {
//    How to Take Input from Users?
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name here : ");
    String name = sc.next();
    System.out.println(" Enter your sir name here : ");
    String name2 = sc.next();
    System.out.println(" This is your name: " + name + " " + name2);

    sc.close();

}

}
