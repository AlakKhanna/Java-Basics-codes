package src.OOps_14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class lab190 {
    public static void main(String[] args) {

        Set courseSet = new HashSet<>();

        courseSet.add("ATB");
        courseSet.add("BTB");
        courseSet.add("CTB");
        courseSet.add("DTB");
        courseSet.add("AEB");

        for (Object o: courseSet)
        {
            System.out.println(o);
        }

        System.out.println("------------------");

        Iterator iterator = courseSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
