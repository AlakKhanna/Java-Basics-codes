package src;
import java.util.Scanner;


public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enetr your row & column number her - ");
        int num = sc.nextInt();
        spiralmethod(num);


    }


    public static void spiralmethod (int num)
    {
        int originalvalue = num;
        int[][] spiral = new int[originalvalue][originalvalue];
        int value =1;

        int mincol=0;
        int minrow=0;
        int maxrow= originalvalue-1;
        int maxcol= originalvalue-1;

        while (value<=originalvalue*originalvalue)
        {
            for (int i = mincol; i<=maxcol; i++)
            {
                spiral[minrow][i]= value;
                value++;
            }
            for (int i = minrow+1; i<=maxrow; i++)
            {
                spiral[i][maxcol]= value;
                value++;
            }

            for (int i = maxcol-1; i>=mincol; i--)
            {
                spiral[maxrow][i]= value;
                value++;
            }

            for (int i = maxrow-1; i>=mincol+1; i--)
            {
                spiral[i][mincol]= value;
                value++;
            }

            mincol++;
            minrow++;
            maxcol--;
            maxrow--;
        }

        for (int i = 0; i<spiral.length; i++)
        {
            for (int j =0; j<spiral.length; j++)
            {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
