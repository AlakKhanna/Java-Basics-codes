package src.OOPS_09;

public class Person {

    String name;

    Person()
    {
        System.out.println("I am default constructor");
    }

    Person(String name)
    {
        this.name = name;
        System.out.println("I am param constructor");
    }

    void printdetail()
    {
        System.out.println(" Your name is " + this.name);
    }
}
