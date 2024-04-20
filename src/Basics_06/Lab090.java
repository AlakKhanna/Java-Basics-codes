package src.Basics_06;

public class Lab090 {
    public static void main(String[] args) {

        for (int i =1; i<=100; i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println("fizz buzz");
            }
            else if (i%3==0)
            {
                System.out.println("Fizz");
            }
            else if (i%5 ==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }

        System.out.println("---EOP---");
    }
}
