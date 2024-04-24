package src.OOPS_10;

public class IV2 {

    public static void main(String[] args) {

        person02 per = new person02();
        person02 per2 = new person02();
        person02 per3 = null;
        per2.run();

    }
}

class person02
{
    int a;

    void  run ()
    {
        System.out.println(" Run called");
    }
}
