package src.OOPS_11.InnerClass;

public class Lab156 {
    public static void main(String[] args) {

        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println(" I am thread");
            }
        };

    }
}
