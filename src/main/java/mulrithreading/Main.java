package mulrithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService poolExecutor = Executors.newFixedThreadPool(4);

        for (int i = 0; i<10000000; i++){
            Multithreading multithreading = new Multithreading();
            multithreading.run();
            poolExecutor.submit(multithreading);
        }

    }

}
