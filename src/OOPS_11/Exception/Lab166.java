package src.OOPS_11.Exception;

public class Lab166 {
    public static void main(String[] args) {

        try {
            int a =0;
            int x = 10/a;
        }catch (Exception e)
        {
            System.out.println("Exit");
            System.exit(0);
        }
        finally {
            System.out.println(" I am final");
        }
    }
}
