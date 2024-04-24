package src.OOPS_11.InnerClass;

public class Lab152 {


    public static void main(String[] args) {
        car c = new car(" Lambo 137");
        car.engine eng = c.new engine("400c");
        eng.start();
        c.drive();
    }
}

class car{
    String make;

   public car( String make)
    {
        this.make=make;

    }

    void drive ()
    {
        System.out.println(" You can drive a car");
    }

    public class engine{

       String horsePower;

       public engine(String horsePower)
        {
            this.horsePower=horsePower;
        }

        void start()
        {
            System.out.println(" Engine is started");
        }

    }

}
