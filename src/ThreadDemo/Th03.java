package src.ThreadDemo;

public class Th03 {

    //task 1 go from 1 to 5
    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("workers");

        workerTH03 worker = new workerTH03(threadGroup, "w1");
        worker.start();

        workerTH03 worker2 = new workerTH03(threadGroup, "w2");
        worker.start();
    }

}

class workerTH03 extends Thread

{

    workerTH03 (ThreadGroup threadGroup, String name)
    {
        super(threadGroup, name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                System.out.println(Thread.currentThread().getName() );
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }

    }
}
