package src.OOPS_12;

import java.awt.*;
import java.util.List;
import java.util.ListIterator;

public class Lab178 {
    public static void main(String[] args) {

        //collection framework
        List fruites = List.of("orange", "Pineapple", "watermellon", " Apple", "Apple");
        List shooping_items= List.of(" Bread", "egg", "choclate");
        List marks = List.of(91,92,93,94);
        List mis = List.of("Alak", 91, true);

        System.out.println(fruites);
        System.out.println(fruites.get(0));
        System.out.println(fruites.size());
        System.out.println(fruites.indexOf("apple"));
        System.out.println(fruites.isEmpty());
    }
}
