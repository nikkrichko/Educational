package Agoritms.recursiveTaskAction;

/**
 * Created by никита on 12.04.14.
 */
public class ActionPlus implements IAction<Integer> {

    // Integer[] [2, 3, 10]
    // input = 3
    // input = 30


    @Override
    public void action(Integer[] input, int cellNumber) {
        input[cellNumber] *= 10;
    }
}
