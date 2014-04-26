package Agoritms;

import java.util.Arrays;
import java.util.concurrent.*;

/**
 * Created by никита on 05.04.14.
 */
public class ArrayProcessor<T> {

    private final T[] inputArray;

    private final IMerger<T> iMerger;

    private final static ExecutorService executorService = Executors.newFixedThreadPool(15);

    public ArrayProcessor(final T[] inputArray, final IMerger<T> iMerger){
        this.inputArray = inputArray;
        this.iMerger = iMerger;
    }





    private T split(T[] array){
        int midlle;
        T[] array_left;
        T[] array_right;
        if (array.length == 1){
            return array[0];
        }
        midlle = array.length / 2;
        array_left = Arrays.copyOfRange(array, 0, midlle);
        array_right = Arrays.copyOfRange(array, midlle, array.length);

        Task task_left = new Task(array_left);
        Task task_right = new Task(array_right);
        Future<T> future_left = executorService.submit(task_left);
        Future<T> future_right = executorService.submit(task_right);


        try {
            return iMerger.merge(future_left.get(), future_right.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void print(){
        System.out.println("our : " + split(inputArray));
    }

    private class Task implements Callable<T>{
        T[] inputarray;
        Task(T[] inputarray){
            this.inputarray = inputarray;
        }
        @Override
        public T call() throws Exception {
            return split(inputarray);
        }
    }

}
