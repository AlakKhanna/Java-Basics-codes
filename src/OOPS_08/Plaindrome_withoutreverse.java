package src.OOPS_08;

import java.util.Scanner;

public class Plaindrome_withoutreverse {


    private static boolean isPlaindrome (String user_input)
    {
        String original_str = user_input;
        char[] chararray= original_str.toCharArray();


        int left =0;
        int right= chararray.length-1;

        while (left<right)
        {
            char temp = chararray[left];
            chararray[left]= chararray[right];
            chararray[right]= temp;

            left++;
            right--;
        }
        String reverse = new String(chararray);

        return original_str.equalsIgnoreCase(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the value, I will tell you it is plaindrome or not");
        String user_input = sc.next();

        boolean result = isPlaindrome(user_input);
        if (result) {
            System.out.println("Is a plaindrome " + user_input);
        } else {
            System.out.println(" Is not a plaindorme " + user_input);
        }

    }
}
