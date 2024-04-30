package src.Questions;
import java. util.Scanner;


public class Question_16 {

    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here, I will share the duplicate letters : ");
        String userInput = sc.nextLine();
        duplicateString(userInput);

    }

    public static void duplicateString (String userInput)
    {
        String originalString = userInput;
        char[] chararray = originalString.toCharArray();
        int count =1;

      for (int i =0; i<chararray.length; i++)
      {
          for (int j =1+i; j<chararray.length; j++)
          {
              if (chararray[i]==chararray[j] && chararray[i] != ' ')
              {
                  count =1;
                  System.out.print(chararray[i] + " , ");
              }
          }
      }


    }



}
