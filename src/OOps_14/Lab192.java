package src.OOps_14;

import java.util.Set;
import java.util.TreeSet;

public class Lab192 {
    public static void main(String[] args) {

        Set courseset = new TreeSet<>();
        courseset.add("ATB");
        courseset.add("MTB");
        courseset.add("FTB");
        courseset.add("BTB");
        courseset.add("TTB");

        for (Object o : courseset)
        {
            System.out.println(o);
        }

    }
}
