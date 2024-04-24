package src.OOPS_11.Interview;

public class I2 {

    public static void main(String[] args) {
        System.out.println(pp.a);
        foo f = new foo();
        pp f1 = new foo();
        Rofl f3= new foo();


        f.m1();

    }
}

interface pp{
    int a =10;

    void m1();

}

abstract class Rofl implements pp
{
abstract void say();
}

class foo extends Rofl{

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    void say() {
        System.out.println("say");
    }
}
