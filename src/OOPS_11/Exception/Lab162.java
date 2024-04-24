package src.OOPS_11.Exception;

public class Lab162 {
    public static void main(String[] args) {

        try {
            String name = null;
            name.trim();
            System.out.println(" I am alak");
        } catch (Exception e) {
            System.out.println(" You are trying to edit the null string, which is not possible in java");
        }
    }
}

