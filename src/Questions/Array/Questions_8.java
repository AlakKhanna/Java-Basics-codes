package src.Questions.Array;
import java.util.Scanner;

public class Questions_8 {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value here and i will tell you it is palindorme or not");
        String userInput= sc.next();
        boolean result = palindromeChecker(userInput);

        if (result)
        {
            System.out.println(" This is plaindrome " + userInput);
        }
        else
        {
            System.out.println(" this is not a palindrome " + userInput);
        }

    }

    static boolean palindromeChecker(String userInput)

    {
        String originalString = userInput;
        char[] charArray = originalString.toCharArray();
        int left = 0;
        int right = charArray.length-1;


        while (left<right)
        {
            char temp = charArray[left];
            charArray[left]= charArray[right];
            charArray[right]= temp;
            left++;
            right--;
        }

        String reverse = new String(charArray);
        return originalString.equalsIgnoreCase(reverse);


    }

}
