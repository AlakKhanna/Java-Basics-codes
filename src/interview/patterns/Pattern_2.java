package src.interview.patterns;

public class Pattern_2 {
    public static void main(String[] args) {

        for (int i =1; i<=5; i++)
        {
            for (int j=5; j>=i; j--)
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
            System.out.println();
        }
    }
}
