package concurency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by никита on 23.03.14.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MySqrt sqrt = new MySqrt(4);
        MySqrt sqrt1 = new MySqrt(5);
        MySqrt sqrt2 = new MySqrt(6);
        MySqrt sqrt3 = new MySqrt(9);


//        Thread t = new Thread(sqrt);
//        Thread t1 = new Thread(sqrt1);
//        Thread t2 = new Thread(sqrt2);
//        Thread t3 = new Thread(sqrt3);
//
//        t.start();
//        t1.start();
//        t2.start();
//        t3.start();



//        try {
//            t.join();
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> future = executor.submit(sqrt);
        Future<Integer> future1 = executor.submit(sqrt1);
        Future<Integer> future2 = executor.submit(sqrt2);
        Future<Integer> future3 = executor.submit(sqrt3);

        future.isDone();
        try {
            System.out.println(future.get());
            System.out.println(future1.get());
            System.out.println(future2.get());
            System.out.println(future3.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

//        System.out.println(future);
//        System.out.println(sqrt1.getA());
//        System.out.println(sqrt2.getA());
//        System.out.println(sqrt3.getA());
//
//        try {
//            Thread.sleep(9000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(sqrt.getA());
//        System.out.println(sqrt1.getA());
//        System.out.println(sqrt2.getA());
//        System.out.println(sqrt3.getA());
//        System.out.println();




    }
}
