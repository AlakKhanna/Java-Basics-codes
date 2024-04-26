package src.OOps_14;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab199 {
    public static void main(String[] args) {


        Hashtable<Integer, String > ht = new Hashtable<>();
        ht.put(1, "one");
        ht.put(2,"two");
        ht.put(3, "three");

        Enumeration<Integer> e = ht.keys();
        while (e.hasMoreElements())
        {
            int key = e.nextElement();
            System.out.println(" Rank : " + key
            + "\t\t Name:"
            +ht.get(key));
        }
    }
}
