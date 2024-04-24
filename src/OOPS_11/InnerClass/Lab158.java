package src.OOPS_11.InnerClass;

public class Lab158 {

    public static void main(String[] args) {
        parent p = new parent();
        child c = new child();
        p=c;
        hello h = new child2();
        child2 ch = (child2) h;


    }
}


class hello{}
class child2 extends hello{

}

//upcasting & downcasting in class

class parent{}
class child extends parent{

}