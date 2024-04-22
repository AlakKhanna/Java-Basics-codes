package src.OOPS_07;

public class reverse_string {
    public static void main(String[] args) {

        String name = "The Testing Academeny";

        String y ="";

        for (int i =name.length()-1; i>=0; i--)
        {
                y = y+name.charAt(i);
        }
        System.out.println(y);
    }
}
