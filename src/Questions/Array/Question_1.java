package src.Questions.Array;

public class Question_1 {

    public static void main(String[] args) {

        float [] f = {91.2f, 83.1f, 61.2f, 42.5f, 62.5f};
        float sum= 0;

        for (float elemnts : f)
        {
            sum = sum+elemnts;
        }
        System.out.println(sum);
    }
}
