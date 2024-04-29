package src.Questions;
import java.util.Scanner;
public class Question_13 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number here : ");
        int user_input = sc.nextInt();
        boolean result = primeNumberChecker(user_input);

    }







    public static boolean primeNumberChecker (int user_input)
    {
        int max = user_input / 2;
        int flag = 0;

        if (user_input == 1 || user_input == 0)
        {
            System.out.println("This is not a prime number ");
            return false;
        }
        else
        {
            for (int i = 2; i <= max; i++)
            {
                if (user_input % i == 0)
                {
                    flag = flag = 1;
                    break;
                }
            }
            if (flag == 0)
            {
                System.out.println("This is a prime number " + user_input);
                return true;
            } else
            {
                System.out.println("This is not a prime number " + user_input);
                return false;
            }

    }
    }

}
