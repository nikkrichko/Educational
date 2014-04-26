package Agoritms;

/**
 * Created by никита on 05.04.14.
 */
public class FinderMax implements IMerger<Integer> {
    @Override
    public Integer merge(Integer input1, Integer input2) {
        if (input1 > input2){
            return input1;
        } else {
            return input2;
        }
    }
}
