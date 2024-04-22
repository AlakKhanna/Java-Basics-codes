package src.OOPS_09.Inheritance.MultiLevel;

public class Lab141 {
    public static void main(String[] args) {

        GrandFather g = new GrandFather();
        g.bhk3();
        System.out.println("------------");

        Father f = new Father();
        f.bhk2();
        f.bhk3();
        System.out.println("------------");

        Daughter d = new Daughter();
        d.bhk1();
        d.bhk2();
        d.bhk3();
        System.out.println("------------");

        GrandFather g1= new Daughter();
        Father f1= new Daughter();
        Daughter D1= new Daughter();



    }
}
