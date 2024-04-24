package src.OOPS_11;

public class Lab151 {

    public static void main(String[] args) {
        po1 p = new po1();
        po1 p2 = new po1();
        p.m1();
        po1.m2();

        po1 p3 = null;


    }
}

class po1{

    static
    {
        System.out.println("SIB");
    }

    {
        System.out.println("IIB");
    }

    int a =10;
    //instance variable
    static int b =20;

    void m1(){
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }

    static void m2()
    {
        System.out.println(b);
    }
}
