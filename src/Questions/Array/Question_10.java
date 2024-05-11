package src.Questions.Array;
import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {

        for (int i =2; i<=100; i++)
        {
            int temp =0;
            for (int j =2; j<=100; j++)
            {
                if (i%j==0)
                {
                    temp=1;
                    break;
                }
            }

            if (temp ==0)
            {
                System.out.println(i);
            }

        }



    }
}
