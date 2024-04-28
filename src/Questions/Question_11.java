package src.Questions;
import java.util.Scanner;
public class Question_11 {
    public static void main(String[] args) {
        // Count vowels and consonants in a String

        int vCount = 0;
        int cCount = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the sentence here : ");
        String userInput = sc.nextLine();

        char [] charArray= userInput.toCharArray();
        for (int i =0; i<charArray.length; i++)
        {
            char temp = charArray[i];
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
            {
                vCount++;
            }
            else
            {
                cCount++;
            }
        }

        System.out.println(vCount);
        System.out.println(cCount);
    }
}
