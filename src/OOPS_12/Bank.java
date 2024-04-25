package src.OOPS_12;

public class Bank {



    private String currency;
        private Integer amount;


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer add (Bank BankName) throws Exception
    {
        if (!(BankName.currency.equalsIgnoreCase("INR")))
        {
            throw new customException("USD to INR not supported");
        }
        Integer sum = this.amount + BankName.amount;
        return sum;

    }
}
