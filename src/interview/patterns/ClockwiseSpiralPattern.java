package src.interview.patterns;

import java.util.Scanner;

public class ClockwiseSpiralPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your row & column count here -: ");
        int num = sc.nextInt();
        int spiral[][]= new int [num][num];

        // System.out.println(spiral.length);
        int value =1;
        int mincol=0;
        int maxcol= num-1;
        int minrow= 0;
        int maxrow=num-1;

        while (value <= num* num)
        {
            for (int i =mincol; i<=maxcol; i++)
            {
                spiral[minrow][i]= value;
                value++;
            }

            for (int j = minrow +1; j<= maxrow; j++)
            {
                spiral[j][maxcol]= value;
                value++;
            }

            for (int k =maxcol-1; k>= mincol; k--)
            {
                spiral[maxrow][k]= value;
                value++;
            }

            for (int l = maxrow -1; l>= minrow+1; l--)
            {
                spiral[l][mincol]= value;
                value++;
            }
            mincol++;
            maxcol--;
            minrow++;
            maxrow--;

        }

        for (int i =0; i<= spiral.length; i++)
        {
            for (int j=0; j<=spiral.length; j++)
            {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
