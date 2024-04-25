package src.OOPS_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab186 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(200);
        marks.add(100);
        marks.add(300);
        marks.add(500);
        marks.add(600);

        Collections.sort(marks);
        System.out.println(marks);

    }
}
