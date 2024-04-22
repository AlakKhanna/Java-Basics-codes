package src.InterviewQuestions;

public class Primenumberbetween1to100 {

    public static void main(String[] args) {
        for (int i =2; i<=100; i++)
        {
            int temp =0;
            for (int j =2; j<i; j++)
            {
                if (i%j ==0)
                {
//                    System.out.println(" not a prime number " + i);
                    temp =1;
                    break;
                }
            }
            if (temp ==0)
            {
                System.out.println(" this is a prime number " + i);
            }
        }
    }

}
