package src.InterviewQuestions;

public class ReverseString_2 {
    public static void main(String[] args) {

        String name = "The testing academy";
        String reverse =" ";

        for (int i= name.length()-1; i>=0; i--)
        {
            reverse = reverse +name.charAt(i);
        }
        System.out.println(reverse);
    }
}
