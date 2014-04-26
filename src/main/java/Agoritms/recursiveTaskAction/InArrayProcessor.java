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





    @Override
    protected void compute() {
        int midlle;
        int[] array_left;
        int[] array_right;
        if (lengthArray.length == 1){

            iAction.action(classInputArray, lengthArray[0]);
            return;

        }

        midlle = lengthArray.length / 2;
        array_left = Arrays.copyOfRange(lengthArray, 0, midlle);
        array_right = Arrays.copyOfRange(lengthArray, midlle, lengthArray.length);

        InArrayProcessor<T> leftTask = new InArrayProcessor<>(classInputArray, array_left, iAction);
        InArrayProcessor<T> rightTask = new InArrayProcessor<>(classInputArray, array_right, iAction);
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
