package src.interview.patterns;

public class patternsquare {

    public static void main (String[] args)
    {
        for (int i =1; i<=5; i++)
        {
            for (int j =5; j>=i; j--)
            {
                if (i>=2 && j<=1)

                System.out.print("*");
            }
            for (int k =1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
