package src.OOPS_07;

public class Lab097 {


    public static void main(String[] args) {
        print("hello");
        print(1);
        print("hello", 1);

    }
    static void print (String s)
    {
        System.out.println(s);
    }

    static void print (int i)
    {
        System.out.println(i);
    }

    static void print (String s, int i)
    {
        System.out.println(s + " " + i);

    }
}
