package src.Basics_02.operators;

public class IncreamentOperator_12 {
    public static void main(String[] args) {

        int a = 10;
        a = a=1;
        a+=1;
        a++;//post
        ++a;//pre

        int a1 = 10;
        System.out.println(++a1);

        int a2 = 10;
        System.out.println(a2++);
        System.out.println(a2);

    }
}
