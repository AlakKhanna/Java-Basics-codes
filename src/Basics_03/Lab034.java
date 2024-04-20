package src.Basics_03;

public class Lab034 {
    public static void main(String[] args) {

        int a =40, b =20, c= 12;

        int max = (a>b) ? ((a>c) ? a:c) : ((b>c)? b:c);
        System.out.println(max);

    }
}
