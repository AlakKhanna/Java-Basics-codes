package src.OOPS_09.Inheritance.SingleLevel;

public class Programming {

    int version;
    String Author;

    Programming()
    {
        System.out.println("Program DC");
    }

    Programming( int version, String Author)
    {
        this.version = version;
        this.Author= Author;
        System.out.println("PC");
    }

    void PrintDetails()
    {
        System.out.println(" Program info - " + this.version + " - " + this.Author);
    }

    void car ()
    {
        System.out.println(" MY parents have car");
    }

    void bhk3()
    {
        System.out.println(" 3BHK house");
    }
}
