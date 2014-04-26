package Agoritms.recursiveTaskAction;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

/**
 * Created by никита on 12.04.14.
 */
public class Clone extends RecursiveAction {

    private static int[] classInputArray;
    private int[] lengthArray;

    public Clone(int[] classInputArray) {
        if (classInputArray !=null)
        this.classInputArray = classInputArray;
        this.lengthArray = new int[classInputArray.length];
        for(int i = 0; i < lengthArray.length;  i++){
            lengthArray[i]=i;
        }
    }

    public Clone(int[] classInputArray, int[] littleArray) {

        this.lengthArray = littleArray;
    }





    @Override
    protected void compute() {
        int midlle;
        int[] array_left;
        int[] array_right;
        if (lengthArray.length == 1){
            classInputArray[lengthArray[0]] *=10;
            return;

        }

        midlle = lengthArray.length / 2;
        array_left = Arrays.copyOfRange(lengthArray, 0, midlle);
        array_right =Arrays.copyOfRange(lengthArray, midlle, lengthArray.length);

        Clone leftTask = new Clone(null, array_left);
        Clone rightTask = new Clone(null, array_right);
        leftTask.fork();
        rightTask.fork();


    }

    public void print(){
        for (int i = 0; i < classInputArray.length; i++) {
            System.out.println("our new : " + classInputArray[i]);
        }
    }
}
