package Agoritms;

import java.util.Arrays;

/**
 * Created by никита on 30.03.14.
 */
public class FindBigger {
    private int[] inputArray;
    private int[] chagnedArray;

    FindBigger(int[] inputArray){
        this.inputArray = inputArray;
        this.chagnedArray = new int[inputArray.length];
    }

    private int findBigger(int[] inputArray, int startPointSeacher){
        for (int i = startPointSeacher+1; i<inputArray.length; i++){
            if (inputArray[startPointSeacher] < inputArray[i]) {
                return inputArray[i];
            }
        }
        return inputArray[startPointSeacher];
    }

    public int[] changesArray(int[] inputArray){
        for(int i = 0; i < inputArray.length; i++){
            chagnedArray[i] = findBigger(inputArray, i);
        }
        return chagnedArray;
    }

    public void print(){

        String oldArr = Arrays.toString(inputArray);
        String newArr = Arrays.toString(chagnedArray);
        System.out.println("old array");
        System.out.println(oldArr);
        System.out.println("NEW array");
        System.out.println(newArr);


    }

    // log_2(8); // a ^ x = B
    // y = x ^ 2



}
