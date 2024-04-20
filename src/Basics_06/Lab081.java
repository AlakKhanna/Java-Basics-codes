package src.Basics_06;

public class Lab081 {
    public static void main(String[] args) {

       int a [] = new int[4];
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        a[0]= 78;
        a[1]= 72;
        a[2]= 73;
        a[3]= 74;
        System.out.println(a[0]);
        for ( int b:a)
        {
            System.out.print(b + " ,");
        }


    }
}
