package src.interview.patterns;

public class pattern_3 {
    public static void main(String[] args) {

        for (int i =1; i<=5; i++)
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
            for (int k=5; k>=i; k--)
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

        }
    }
