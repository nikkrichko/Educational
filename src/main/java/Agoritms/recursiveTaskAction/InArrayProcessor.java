package Agoritms.recursiveTaskAction;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

/**
 * Created by никита on 12.04.14.
 */
public class InArrayProcessor<T> extends RecursiveAction {
    private IAction<T> iAction;
    private T[] classInputArray;
    private int[] lengthArray;
    
    private int from, to;

    public InArrayProcessor(T[] classInputArray, IAction<T> iAction) {
        this.iAction = iAction;
        if (classInputArray != null)
        this.classInputArray = classInputArray;
        this.lengthArray = new int[classInputArray.length];
        for(int i = 0; i < lengthArray.length;  i++){
            lengthArray[i]=i;
        }
    }
    
    public InArrayProcessor(T[] classInputArray, int[] littleArray, IAction<T> iAction) {
        this.classInputArray = classInputArray;
        this.iAction = iAction;
        this.lengthArray = littleArray;
    }

    private InArrayProcessor(T[] classInputArray, int[] littleArray, IAction<T> iAction, int from, int to) {
        this(classInputArray, iAction, littleArray);
        this.from = from
        this.to = to;
    }

    @Override
    protected void compute() {
        int midlle;
        if (to - from == 1){
            iAction.action(classInputArray, lengthArray[to - from]);
            return;
        }
        int midlle = from + to / 2;

        InArrayProcessor<T> leftTask = new InArrayProcessor<>(classInputArray, lengthArray, iAction, from, middle);
        InArrayProcessor<T> rightTask = new InArrayProcessor<>(classInputArray, lengthArray, iAction, from + middle, to);
        leftTask.fork();
        rightTask.fork();
        leftTask.join();
        rightTask.join();
    }

    public void print(){
        for (int i = 0; i < classInputArray.length; i++) {
            System.out.println("our new : " + classInputArray[i]);
        }
    }



}
