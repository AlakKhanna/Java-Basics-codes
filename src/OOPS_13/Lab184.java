package src.OOPS_13;

import java.util.Enumeration;
import java.util.Vector;

public class Lab184 {
    public static void main(String[] args) {

        Vector v = new Vector<>();
        Vector<String> v2 = new Vector<>();
        v2.add("Alak");
        v2.add("Vijay");
        v2.add("Kiyaan");

        Enumeration e = v2.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }



    }
}
