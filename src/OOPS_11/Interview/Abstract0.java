package src.OOPS_11.Interview;

public class Abstract0 {


}

abstract class person01{

    abstract void say();

    void eat()
    {
        System.out.println(" I am eating");
    }
}

abstract class student1 extends person01{

    abstract void m2();


}

class alak extends  student1{

    @Override
    void say() {
        System.out.println(" say ");
    }

    void m2(){
        System.out.println("m2");
    }
}
