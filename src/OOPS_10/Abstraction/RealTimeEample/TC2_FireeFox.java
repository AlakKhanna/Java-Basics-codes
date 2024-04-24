package src.OOPS_10.Abstraction.RealTimeEample;

public class TC2_FireeFox extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println(" Open FF");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println(" Close FF");
        return null;
    }
}
