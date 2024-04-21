package src.OOPS_07;

public class Lab093 {
    static int sum (int a, int b)
    {
        return a+b;
    }
    static int sum (int a)
    {
        return a;
    }
    static int sum ()
    {
        return 99;
    }

    static void sayHello()
    {
        System.out.println(" Hello");
    }
    public static void main(String[] args) {

        int c = sum(2,3);
        System.out.println(c);
        sayHello();

    }
}
