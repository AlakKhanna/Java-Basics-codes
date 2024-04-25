package src.OOPS_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lab188 {
    public static void main(String[] args) {


        Student s1=  new Student(1, "Alak");
        Student s2=  new Student(10, "Vijay");
        Student s3=  new Student(3, "Kiyaan");

        List<Student> student= new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);


        Collections.sort(student);
        System.out.println(student);
        Iterator iterator = student.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
