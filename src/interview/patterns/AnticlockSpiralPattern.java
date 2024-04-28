package src.interview.patterns;

import java.util.Scanner;

public class AnticlockSpiralPattern {
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
            for (int i =minrow; i<=maxrow; i++)
            {
                spiral[i][mincol]= value;
                value++;
            }
            for (int j = mincol+1; j<= maxcol; j++)
            {
                spiral[maxrow][j]= value;
                value++;
            }

            for (int k = maxrow-1; k>=minrow; k--)
            {
                spiral[k][maxcol]= value;
                value++;
            }

            for (int l= maxcol-1; l>=mincol+1; l--)
            {
                spiral[minrow][l]= value;
                value++;
            }
            mincol++;
            maxcol--;
            minrow++;
            maxrow--;

        }

        for (int i =0; i< spiral.length; i++)
        {
            for (int j=0; j<spiral.length; j++)
            {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
