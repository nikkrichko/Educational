package Agoritms;

import java.util.Arrays;

/**
 * Created by никита on 01.04.14.
 */
public class SortMerge {

    // merge(int[], int[])
    // _ _ _       |        _ _ _
    // [1 2 3  4 5 6 ]


    private int[] merge(int[] array_1, int[] array_2){
        int[] outputArray = new int[array_1.length + array_2.length];
        int counterAr_1 = 0;
        int counterAr_2 = 0;
        for(int i = 0; i < outputArray.length; i++){

            if (counterAr_1 < array_1.length &&
                    (counterAr_2 >= array_2.length ||
                        array_1[counterAr_1] < array_2[counterAr_2]))
            {
                outputArray[i] = array_1[counterAr_1];
                counterAr_1++;
            } else {
                outputArray[i] = array_2[counterAr_2];
                counterAr_2++;
            }
        }
        return outputArray;
    }

    //    1 2 4 5 log(n)
    //     /   \
    //   1 2     4 5
    //    / \      /  \
    //  1    2    4     5

    private int[] split(int[] array){
        int midlle;
        int[] array_left;
        int[] array_right;
        if (array.length == 1){
            return array;
        }
        midlle = array.length / 2;
        array_left = Arrays.copyOfRange(array, 0, midlle);
        array_right = Arrays.copyOfRange(array, midlle, array.length);

        return merge(split(array_left), split(array_right));




    }

}
