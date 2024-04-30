package src.Questions.Array;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row length here ");
        int row = sc.nextInt();
        System.out.println("Enter the column length here ");
        int column = sc.nextInt();

        int[][] twoDArray= new int[row][column];

        for (int i =0; i<row; i++)
        {
            for (int j =0; j<column; j++)
            {
                System.out.println("Enter your values here ");
                twoDArray[i][j]= sc.nextInt();
            }
        }
        for (int i =0; i<twoDArray.length; i++)
        {
            for (int j=0; j<twoDArray.length; j++)
            {
                System.out.print(twoDArray[i][j]+ "\t" );
            }
            System.out.println();
        }


    }
}
