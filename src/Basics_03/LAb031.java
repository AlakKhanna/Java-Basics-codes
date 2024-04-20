package src.Basics_03;

public class LAb031 {
    public static void main(String[] args) {

        String name = "Alak Khanna";
        String name1 = "Alak Khanna";
        String name2 = new String("Alak Khanna");

        System.out.println( name == name1);
        System.out.println(name.equals(name1));
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
    }
}
