package src.Basics_02.operators;

public class TypeCastingOperator_08 {
    public static void main(String[] args) {
        //casting - mold

        byte b =10;
        int a = b;// implicit casting grayed out because JVM done automatic

        int a1 = 300;
       // byte a2 = a1; // invalid
        byte a2 = (byte) a1;
        System.out.println(a2);

        int course =100;
        float GST = 18.45f;
        float total = course + GST *course;
        System.out.println(total);





    }
}
