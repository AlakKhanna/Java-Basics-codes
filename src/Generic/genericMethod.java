package src.Generic;

public class genericMethod {

    public static void main (String[] args)
    {
        temp(" Alak", "Vijay", "Kiyaan");
    }

    public static <t1, t2, t3> void temp (t1 x, t2 y, t3 z)
    {
        System.out.println(" This is x " + x);
        System.out.println(" This is y " + y);
        System.out.println(" This is z " + z);


    }
}
