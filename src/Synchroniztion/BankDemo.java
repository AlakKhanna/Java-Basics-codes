package src.Synchroniztion;

public class BankDemo {

    public static void main(String[] args) {
        bank at = new bank();
        Runnable runnable = new AccountThread(at);
        Thread th1 = new Thread(runnable, "Alak");
        th1.start();
        Thread th2 = new Thread(runnable, "Vijay");
        th1.start();



    }
}


class  AccountThread implements Runnable
{
    bank Bank;
    public  AccountThread(bank accservices)
    {
        this.Bank= accservices;

    }
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
        Bank.withDram(225);
        if(Bank.getBalance()<0)
        {
            System.out.println(" Amount Max out!!");
        }
        }
    }
}

class bank{
    int balance =1000;

    synchronized void withDram (int amounTo)
    {
        Thread th = Thread.currentThread();
        if (balance>= amounTo)
        {
            System.out.println(" withdraw --" + amounTo + "\t" +th.getName());
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            balance = balance-amounTo;
            System.out.println(balance + " done - \t" + th.getName());
        }
        else
        {
            System.out.println("Low Balance");
        }

    }

    public int getBalance()
    {
        return balance;
    }
}