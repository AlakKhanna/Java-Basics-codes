package src.OOPS_09.Inheritance.SingleLevel;

public class Java extends Programming {

    String newFeature;

    Java()
    {
        System.out.println("Java DC");
    }

    Java(String newFeature)
    {
        this.newFeature= newFeature;
    }

    void printinfo()
    {
        System.out.println("Feature - "+ this.newFeature);
        System.out.println("Author Details - " + this.Author);
        System.out.println("Version Details - " + this.version);
    }
}
