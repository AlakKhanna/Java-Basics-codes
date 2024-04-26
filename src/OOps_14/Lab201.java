package src.OOps_14;

public class Lab201 {
    public static void main(String[] args) {
        temp("Alak");
        temp(123);
        temp(true);

        Integer result = max(3,4);
        System.out.println(result);

    }
    public static<T> void temp (T x){
        System.out.println(x);
    }

    public static Integer max(Integer a, Integer b)
    {
        if(a>b)
        {
            return a;
        }
        else
            return b;
    }
}
