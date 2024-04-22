package src.OOPS_09.Inheritance.Hierarchical;

public class Vehicle {
    void VehicleHasTopSpeed()
    {
        System.out.println(" Yeah from " + getClass().getSimpleName());
    }

    Vehicle(){
        System.out.println(" This is vehicle");
    }
}
