package src.Questions;
import  java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number,, I will tell you it is prime or not -");
    int num = sc.nextInt();
    int divide= num/2;
    int temp =0;

    if (num==0 || num==1)
    {
        System.out.println("This is not a prime number - " + num);
    }
    else {
        for (int i =2; i<=divide; i++)
        {
            if (num%i==0)
            {
                System.out.println("this is not a prime number - " + num);
                temp =1;
                break;
            }
        }
    }
    if (temp==0)
    {
        System.out.println("this is prime number - " + num);
    }

    }
}
