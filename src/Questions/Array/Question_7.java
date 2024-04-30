package src.Questions.Array;
import java .util.Scanner;
public class Question_7 {

    public static void main(String[] args)
    {

       pirntTraingle();



    }

    static void pirntTraingle ()
    {
        for (int i =0; i<=5; i++)
        {
            for (int j =0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
