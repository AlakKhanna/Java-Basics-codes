package src.Questions;
import  java.util.Scanner;

public class Question_15 {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value here, I will remove reverse it ");
        String userInput = sc.nextLine();
        Question_15 q = new Question_15();
        q.reverseString(userInput);




    }


    public void reverseString (String userInput)
    {
        char[] charArray = userInput.toCharArray();

        char temp;
        int left=0;
        int right= charArray.length-1;

        while (left<right)
        {
            temp = charArray[left];
            charArray[left]= charArray[right];
            charArray[right]= temp;
            left++;
            right--;
        }

        String reverse = new String(charArray);
        System.out.println(reverse);

    }
}
