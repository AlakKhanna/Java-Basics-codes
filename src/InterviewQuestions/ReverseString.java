package src.InterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {

        String name = "The testing Academy";
        char[] charArray = name.toCharArray();
        System.out.println(charArray.length);

        int left =0;
        int right = charArray.length-1;

        while (left<right)
        {
            char temp = charArray[left];
            charArray[left]= charArray[right];
            charArray[right]= temp;
            left ++;
            right --;
        }

        String reverse = new String( charArray);
        System.out.println(reverse);
    }
}
