package mulrithreading;


public class Multithreading implements Runnable {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " STARTED");
        for (int i = 0; i < 10; i++){
           // System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " END");
    }
}
