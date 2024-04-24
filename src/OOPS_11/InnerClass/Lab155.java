package src.OOPS_11.InnerClass;

import src.OOPS_10.encapsulation.Student;

public class Lab155 {
    public static void main(String[] args) {
        student s1= new student() {
            @Override
            public void setId() {

            }
        };
        s1.setId();

        nonamee s2 = new nonamee();

        b test = new b() {

        };


    }
}


abstract class  b {

    int var = 12;

}

interface student {
    int id = 11;

    void setId();

}

class nonamee implements student{

    @Override
    public void setId() {

    }
}