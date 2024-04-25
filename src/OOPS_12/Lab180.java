package src.OOPS_12;

import java.util.ArrayList;
import java.util.List;

public class Lab180 {
    public static void main(String[] args) {

        List<String> ArrayList = new ArrayList<>();
        ArrayList.add("Alak");
//        ArrayList.add(30);
        ArrayList.add("Sep");
//        ArrayList.add(true);

        System.out.println(ArrayList);

        ArrayList.set(1,"Khanna");
        System.out.println(ArrayList);

        for (int i  =0 ; i<ArrayList.size(); i++)
        {
            System.out.println(ArrayList.get(i));
        }

        for (Object o : ArrayList)
        {
            System.out.println(o);
        }
    }
}
