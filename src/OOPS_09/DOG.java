package src.OOPS_09;

import java.util.Stack;

public class DOG {

    String name;//refrence variable

    void bark()
    {
        int age= 10; //local variable
        System.out.println("Bark");
        System.out.println(" dog name is ->" + name);
    }
    DOG()
    {
        System.out.println("DC");
    }
    DOG (String name)
    {
        this.name= name;
        System.out.println("PC");
    }

    void printdetails()
    {
        System.out.println(" This is dog name " + this.name);
    }
}
