package src.OOPS_12;

import java.io.FileReader;

public class Lab172 {
    public static void main(String[] args) {

        int a = 10/0;
        try {
            FileReader fr = new FileReader("c://txt");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}
