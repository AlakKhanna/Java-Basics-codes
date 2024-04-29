package src.Generic;

public class genericClass {

    public static void main(String[] args) {

        test <Integer> i = new test<>(6);
        System.out.println(i.getObj());

        test<String> s = new test<>("Alak");
        System.out.println(s.getObj());

        test<Double> d = new test<>(5.42);
        System.out.println(d.getObj());
    }

}

class test <t>
{


    t obj;
    test ( t obj)
    {
        this.obj= obj;
    }
    public t getObj() {
        return this.obj;
    }


}