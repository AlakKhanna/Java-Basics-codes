package src.OOPS_10.Abstraction.RealTimeEample;

public class TC1_Chrome extends BaseClass{
    @Override
    String openBrowser() {

        System.out.println(" Starting Chrome");
        return null;
    }

    @Override
    String closeBrowser() {

        System.out.println(" Closing Chrome");
        return null;
    }
}
