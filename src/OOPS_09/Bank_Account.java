package src.OOPS_09;

public class Bank_Account {

    String BankName;
    int bal;

    String BankCode;

    void printDetails()
    {
        System.out.println(this.BankName);
        System.out.println(this.bal);
        System.out.println(this.BankCode);
    }

    Bank_Account(){
        BankName = "SBI";
        System.out.println("I am default construtor");

    }

    Bank_Account(String BankName, String BankCode){
        this.BankName = BankName;
        this.BankCode = BankCode;
        System.out.println("I am Param construtor");

    }

//    Bank_Account(String BankName, int bal)
//    {
//        this.BankName = BankName;
//        this.bal= bal;
//
//    }

}
