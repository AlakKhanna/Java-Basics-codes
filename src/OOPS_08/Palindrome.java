package src.OOPS_08;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a string, i will check for plaindrome");
        String user_input = sc.next();

        boolean result = isPalindrome (user_input);

        if (result)
        {
            System.out.println( " This is a plaindrome " + user_input);
        }
        else
        {
            System.out.println(" not a plaindrome " + user_input);
        }
    }

    private static boolean isPalindrome(String userInput) {
        String original_str = userInput;
        StringBuilder sb = new StringBuilder(userInput);
        sb.reverse();
        return  original_str.equalsIgnoreCase(sb.toString());


    }
}
