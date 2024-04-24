package src.OOPS_10.Poly.MethodOverLoading;

public class Person {

    void speak (String a)
    {
        System.out.println(" A is a String. " + a);
    }

    void speak (int x)
    {
        System.out.println(" x is a integer. " + x);
    }

    void speak (double d)
    {
        System.out.println(" d is a double. " + d);
    }
}
