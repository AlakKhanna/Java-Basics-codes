package src.OOPS_11.Exception;

public class Lab168 {
    public static void main(String[] args) {
        extracted2();

    }

    private static void extracted2()
    {
        extracted1();
        System.out.println(" will not exxecuted");
    }

    private static void extracted1()
    {
        extracted();
    }


    private static  void extracted()
    {
        try {
            String name = null;
            name.length();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
