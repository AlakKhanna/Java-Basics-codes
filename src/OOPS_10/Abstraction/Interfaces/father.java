package src.OOPS_10.Abstraction.Interfaces;

interface father {

    void loan1k();

    default  void print()
    {
        System.out.println(" I am default method");
    }

    static void print2 ()
    {
        System.out.println(" I am static");
    }

}
