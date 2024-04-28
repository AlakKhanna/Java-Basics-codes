package src.Questions;
import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        //Create a program that checks whether a given string is a palindrome.
        // A palindrome is a word or phrase that reads the same backward as forward
        // (ignoring spaces, punctuation, and capitalization). Use an if-else statement
        // to determine if the string is a palindrome.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value, I will tell you it is plaindrome or not : ");
        String user_input = sc.next();
        boolean result = isPlaindrome(user_input);

        if (result)
        {
            System.out.println("This is palindrome : " + user_input);
        }
        else
        {
            System.out.println("This is not a palindrome : " + user_input);
        }







    }

    public static  boolean isPlaindrome( String user_input)
    {
        String originalString = user_input;
        char[] chararray= originalString.toCharArray();

        int left=0;
        int right = chararray.length-1;

        while (left<right)
        {
            char temp= chararray[left];
            chararray[left]= chararray[right];
            chararray[right]= temp;
            left++;
            right--;

        }

        String result = new String (chararray);
        return originalString.equalsIgnoreCase(result);


    }

}
