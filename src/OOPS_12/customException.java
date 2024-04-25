package src.OOPS_12;

public class customException extends Exception{

    customException( String msg)
    {
        super(msg);
        System.out.println("Custom exception");
    }
}
