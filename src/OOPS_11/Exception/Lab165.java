package src.OOPS_11.Exception;

public class Lab165 {

    public static void main(String[] args) {
        try {
            String ip =args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10/a;
            System.out.println(a);
            System.out.println(b);
        }catch (ArithmeticException | NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(" I want to be executed any how");
        }
    }
}
