package src.Questions.Array;
import java.util.Scanner;

public class Question_9 {

 public static void main (String[] args)
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your value here: ");
     int userinput= sc.nextInt();
     spiralMethod(userinput);
 }


    static void spiralMethod(int userInput)
    {
        int input = userInput;
        int [][] spiral = new int[input][input];

        int value =1;
        int minCol= 0;
        int maxCol= input-1;
        int minRow= 0;
        int maxRow = input-1;

        while (value<= input*input)
        {
            for (int i =minCol; i<=maxCol; i++)
            {
                spiral[minRow][i]= value;
                value++;
            }

            for (int i =minRow+1; i<=maxRow; i++)
            {
                spiral[i][maxCol]= value;
                value++;
            }

            for (int i =maxCol-1; i >=minCol; i--)
            {
                spiral[maxRow][i]= value;
                value++;
            }

            for (int i =maxRow-1; i >=minRow+1; i--)
            {
                spiral[i][minCol]= value;
                value++;
            }

            minCol++;
            maxCol--;
            minRow++;
            maxRow--;
        }

        for (int i=0; i<spiral.length; i++)
        {
            for (int j =0; j<spiral.length;j++ )
            {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }

    }


}
