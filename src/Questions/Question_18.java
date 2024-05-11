package src.Questions;
import java.util.Scanner;

public class Question_18 extends Question_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the array length here");
        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter the array value here : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("correct sequence of array ");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " \t ");
        }
        System.out.println();

        System.out.println("reverse sequence of array ");

        for (int i = arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i] + " \t ");
        }


    }
}


