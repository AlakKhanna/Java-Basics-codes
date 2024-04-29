package src.ThreadDemo;

public class TH04 {

    public static void main(String[] args) {

        workerTH034 w1= new workerTH034();
        Thread t1 = new Thread(w1);
        t1.start();
    }
}

class workerTH034 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}


