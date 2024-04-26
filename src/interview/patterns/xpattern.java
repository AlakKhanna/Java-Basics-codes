package src.interview.patterns;

public class xpattern {

    public static void main(String[] args) {

        for (int i = 1; i<=5; i++)
        {
            for (int j =1; j<=i; j++)
            {
                if (i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            for (int k =5; k>=i; k--)
            {
                System.out.print(" ");
            }
            for (int l =5; l>=i; l--)
            {
                if (i==l)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }

        for (int m =1; m<=5; m++)
        {
            for (int n =5; n>=m; n--)
            {
                if (m==n)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            for (int o=1;o<=m; o++)
            {
                System.out.print(" ");
            }
            for (int p=1;p<=m; p++)
            {
                if (p==m)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }



    }
}
