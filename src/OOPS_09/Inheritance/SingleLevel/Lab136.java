package src.OOPS_09.Inheritance.SingleLevel;

public class Lab136 {
    public static void main(String[] args) {

        Programming p = new Programming();

        System.out.println("------------");
        Java j = new Java(" print");
        System.out.println("------------");
        Programming p2 = new Java();
        System.out.println("------------");
        j.car();
        j.bhk3();
        j.Author =" James Gosling";
        j.version= 12;
        j.printinfo();
        System.out.println("------------");
        Python py = new Python();
        py.car();
        py.bhk3();




    }
}
