package Agoritms;

import Agoritms.recursiveTaskAction.ActionPlus;
import Agoritms.recursiveTaskAction.InArrayProcessor;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by никита on 30.03.14.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] a = new Integer[5000];
        for (int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*11000);
            System.out.println(a[i]);
        }
        System.out.println("--------------------------");
        System.out.println("**************************");



//        ArrayProcessor<Integer> arrayProcessor = new ArrayProcessor<>(a, new FinderMax());
//        arrayProcessor.print();
//        ProcessorTask<Integer> processorTask = new ProcessorTask<>(a, new FinderMax());
//        ForkJoinPool forkJoinPool = new ForkJoinPool();
//        forkJoinPool.submit(processorTask);
//        System.out.println("our "+ processorTask.join());



//        InArrayProcessor<Integer> inArrayProcessor = new InArrayProcessor<Integer>(a, new ActionPrint());
//        ForkJoinPool forkJoinPool = new ForkJoinPool();
//        forkJoinPool.submit(inArrayProcessor);
//        inArrayProcessor.join();

        System.out.println("**************************");

        InArrayProcessor<Integer> inArrayProcessor = new InArrayProcessor<Integer>(a, new ActionPlus());
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(inArrayProcessor);
        inArrayProcessor.join();

        inArrayProcessor.print();





//        Clone clone = new Clone(a);
//        ForkJoinPool forkJoinPool = new ForkJoinPool();
//        forkJoinPool.submit(clone);
//        clone.join();


    }
}
