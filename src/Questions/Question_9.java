package src.Questions;

public class Question_9 {
    public static void main(String[] args)
    {
        //Left Triangle Star Pattern

        for (int i =1; i<=5; i++)
        {
            for (int j =5; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
