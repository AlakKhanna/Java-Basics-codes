package src.OOPS_08;

public class Lab118 {
    public static void main(String[] args) {

        String name = "Alak";
        String name2 = new String("Alak");
        String name3 = new String("alak");

        System.out.println( name== name2); //false
        System.out.println(name.equals(name2)); //true
        System.out.println(name.equals(name3)); //false
        System.out.println(name.equalsIgnoreCase(name3)); //true

    }
}
