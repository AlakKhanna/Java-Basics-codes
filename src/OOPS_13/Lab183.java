package src.OOPS_13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab183 {
    public static void main(String[] args) {

        List ttaCourseList = new ArrayList<>();
        ttaCourseList.add("ATB");
        ttaCourseList.add("BTB");
        ttaCourseList.add("CTB");
        ttaCourseList.add("DTB");
        ttaCourseList.add("ETB");


        ListIterator listIterator = ttaCourseList.listIterator(ttaCourseList.size());
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }
}
