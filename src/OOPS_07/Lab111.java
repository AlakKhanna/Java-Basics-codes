package src.OOPS_07;

public class Lab111 {

    public static void main(String[] args) {

        String name = "Academy";
        char[] charArray = name.toCharArray();
        System.out.println(charArray.length);

        int left =0;
        int right = charArray.length-1;

        while (left<right)
        {
            char temp = charArray[left];
            charArray[left]= charArray[right];
            charArray[right]= temp;
            left++;
            right--;
        }
        String reverse = new String(charArray);
        System.out.println(reverse);


//        String y ="";
//
//        for (int i = name.length()-1; i>=0; i--)
//        {
//            y= y+name.charAt(i);
//        }
//        System.out.println(y);
    }
}
