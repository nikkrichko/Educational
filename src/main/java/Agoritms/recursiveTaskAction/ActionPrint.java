package Agoritms.recursiveTaskAction;

/**
 * Created by никита on 12.04.14.
 */
public class ActionPrint implements IAction<Integer> {
    @Override
    public void action(Integer[] input, int cellNumber) {
        System.out.println("our new" + input[cellNumber]);
    }


}
