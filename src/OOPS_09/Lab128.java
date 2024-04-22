package src.OOPS_09;

public class Lab128 {

    public static void main(String[] args) {

        Bank_Account SBI = new Bank_Account();
        SBI.printDetails();

        System.out.println("--------------------------");

        Bank_Account HDFC = new Bank_Account("HDFC", "123");
        HDFC.printDetails();

        System.out.println("--------------------------");

        Bank_Account ICICI = new Bank_Account("ICICI", "456");
        ICICI.printDetails();


    }
}
