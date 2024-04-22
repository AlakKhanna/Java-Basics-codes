package src.OOPS_08;

public class Lab117 {
    public static void main(String[] args) {

        String name = "Alak";
        System.out.println(name.concat(" Khanna"));
        System.out.println(name.contains("a"));
        System.out.println(name);

        String expectedResult= "password@123";
        String actualResult ="Password@123";

        if (expectedResult.equalsIgnoreCase(actualResult))
        {
            System.out.println("yes");
        }

        if (expectedResult.equals(actualResult))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

    }
}
