package src.OOPS_11.InnerClass;

public class Lab154 {

    public static void main(String[] args) {

        alak a = new alak();
        alak.Ipad eatinga= a.new Ipad();
        eatinga.eating();


    }
}

class alak{

    int age =35;

    void eat()
    {
        System.out.println("I am eating");
    }

    class Ipad{
        void eating(){
            System.out.println(" I am IPAD");
            System.out.println(age);
        }
    }
}
