package src.OOps_14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab189 {
    public static void main(String[] args) {

        Set fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("Mango");
        fruits.add("Apple");

        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Apple"));
        System.out.println();

        Iterator iterator = fruits.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
