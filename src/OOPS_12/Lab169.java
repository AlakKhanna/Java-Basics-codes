package src.OOPS_12;

public class Lab169 {

    public static void main(String[] args) {
        extracted(0);
    }

    private static int extracted(int b) {
        int a = 0;
        if (b == 0) {
            throw new ArithmeticException(" B can't be zero");
        } else {
            a = 10 / b;
        }
        System.out.println(a);
        return a;
    }
}