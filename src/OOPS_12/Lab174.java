package src.OOPS_12;

public class Lab174 {
    public static void main(String[] args) throws Exception{

        Bank jpchase = new Bank("USD",100);
        Bank HDFC = new Bank("INR", 100);
        Bank icici = new Bank("INR", 100);

        System.out.println(HDFC.add(icici));
        System.out.println(HDFC.add(jpchase));

        //custom exception

    }
}
