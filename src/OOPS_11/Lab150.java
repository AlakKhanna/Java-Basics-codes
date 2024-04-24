package src.OOPS_11;

public class Lab150 {
    public static void main(String[] args) {
        StaticDemo.CollegeName ="TTA";
        System.out.println(StaticDemo.CollegeName);
        StaticDemo.printName();
        StaticDemo s = new StaticDemo();
        s.version= 99;
        s.printVersion();




    }
}
