package src.Questions.Array;
import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the row value here : ");
         int row = sc.nextInt();
         System.out.println("Enter the column value here :");
         int column = sc.nextInt();
         spiralFunction(row, column);





    }

    public static  void spiralFunction(int user_input1, int user_input2)

    {
        int row = user_input1;
        int column = user_input2;

        int [][] spiral = new int[row][column];

        int value=1;
        int minCol= 0;
        int maxcol= column-1;
        int minrow= 0;
        int maxRow=row-1;

        while(value<=spiral.length*spiral.length)
        {

            for (int i = minCol; i<= maxcol; i++)
            {
                spiral[minrow][i]= value;
                value++;
            }
            for (int i = minrow+1; i<= maxRow; i++)
            {
                spiral[i][maxcol]= value;
                value++;
            }
            for (int i = maxcol-1; i>= minCol; i--)
            {
                spiral[maxRow][i]= value;
                value++;
            }

            for (int i = maxRow-1; i>= minrow+1; i--)
            {
                spiral[i][minCol]= value;
                value++;
            }

            minrow++;
            minCol++;
            maxcol--;
            maxRow--;
        }

        for (int i =0; i<=spiral.length; i++)
        {
            for (int j=0; j<=spiral.length; j++)
            {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
