package Agoritms;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

/**
 * Created by никита on 07.04.14.
 */
public class ProcessorTask<T> extends RecursiveTask<T> {
    private T[] inputArray;
    private IMerger<T> iMerger;
    public ProcessorTask(T[] inputArray, IMerger<T> iMerger) {
        this.inputArray = inputArray;
        this.iMerger = iMerger;
    }

    @Override
    protected T compute() {
        int midlle;
        T[] array_left;
        T[] array_right;
        if (inputArray.length == 1){
            return inputArray[0];
        }

        midlle = inputArray.length / 2;
        array_left = Arrays.copyOfRange(inputArray, 0, midlle);
        array_right = Arrays.copyOfRange(inputArray, midlle, inputArray.length);

        ProcessorTask<T> leftTask = new ProcessorTask<>(array_left, iMerger);
        ProcessorTask<T> rightTask = new ProcessorTask<>(array_right, iMerger);
        leftTask.fork();
        rightTask.fork();

        return iMerger.merge(leftTask.join(), rightTask.join());
    }

}
