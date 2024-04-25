package src.OOPS_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Lab179 {


    public static void main(String[] args) {
        List ArrayList = new ArrayList<>();
         ArrayList.add("Alak");
         ArrayList.add(30);
         ArrayList.add("Sep");
         ArrayList.add(true);

        System.out.println(ArrayList);

        ArrayList.set(3,"Khanna");
        System.out.println(ArrayList);

        for (int i  =0 ; i<ArrayList.size(); i++)
        {
            System.out.println(ArrayList.get(i));
        }
        System.out.println("-------------------");
        for (Object o : ArrayList)
        {
            System.out.println(o);
        }
        System.out.println("-------------------");

        Iterator iterator = ArrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
