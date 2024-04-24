package src.OOPS_10.Abstraction.Interfaces.RealTimeExample;

public class Car implements Engine, Break{
    void Start ()
    {
        System.out.println(" Starting the car");
        StartEngine();
        breaks();
    }

    @Override
    public Void StartEngine() {
        System.out.println(" Started Engine");
        return null;
    }

    @Override
    public void breaks() {
        System.out.println(" Break is working fine");
    }
}
