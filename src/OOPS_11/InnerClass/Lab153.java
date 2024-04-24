package src.OOPS_11.InnerClass;

public class Lab153 {

    ooc outer = new ooc();
    ooc.staticNestedClassInner stat = new ooc.staticNestedClassInner();


}

class ooc{

    static int a =100;
    int b =900;

    static class  staticNestedClassInner{

        void show()
        {
            System.out.println(a);
        }
    }
}
