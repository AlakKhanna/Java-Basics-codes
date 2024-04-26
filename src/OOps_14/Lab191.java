package src.OOps_14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;


public class Lab191 {
    public static void main(String[] args) {

        Set linkhashset = new HashSet<>();

        linkhashset.add("alak");
        linkhashset.add("Vijay");
        linkhashset.add("Kiyaan");

        Iterator iterator = linkhashset.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }



    }
}
