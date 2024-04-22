package src.OOPS_08;

public class Lab121 {

    public static void main(String[] args) {

        String user_input = "The testing academy";

        //String original_str = user_input;
        char[] chararray= user_input.toCharArray();


        int left =0;
        int right= chararray.length-1;

        while (left>right)
        {
            char temp = chararray[left];
            chararray[left]= chararray[right];
            chararray[right]= temp;

            left++;
            right--;
        }
        String reverse = new String(chararray);
        System.out.println(reverse);

        //return original_str.equalsIgnoreCase(reverse);
    }
}
