package src.OOPS_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab182 {
    public static void main(String[] args) {
        List<String> coursebatch = new ArrayList<>();
        coursebatch.add("ATB");
        coursebatch.add("MTB");
        coursebatch.add("PTB");
        coursebatch.add("LAPIB");
        coursebatch.add("SDET Blueprint");


        List numlist = new ArrayList<>();
        numlist.add(500);
        numlist.add(100);
        numlist.add(100);
        numlist.add(390);

        coursebatch.addAll(numlist);
        System.out.println(coursebatch);

        System.out.println("-------------------");

        Iterator iterator = coursebatch.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
}
