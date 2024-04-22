package src.OOPS_09;

public class ATBPerson {
    String name;
    long phone_no;
    String email;
    void talk()
    {
        System.out.println("Talk!");
    }

    void printDetails()
    {
        System.out.println(name);
        System.out.println(phone_no);
    }

    ATBPerson()
    {
        System.out.println("I am called");
    }

    ATBPerson(String name)
    {
        this.name= name;
    }
}
