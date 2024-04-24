package src.OOPS_10;

public class IV1 {

    public static void main(String[] args) {

        person p = new person();
        person p2 = new person(120);
        person p3 = new person(120, true);

        System.out.println(p.a);
        System.out.println(p2.a);

    }
}

class person{
     int a;
     boolean b;

     person()
     {
         this.a=10;
     }

     person(int b)
     {
         this.a = b;
     }

    person(int b, boolean a)
    {
        this.a = b;
        this.b = a;
    }
}
