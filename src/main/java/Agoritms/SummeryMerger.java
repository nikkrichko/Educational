package Agoritms;

/**
 * Created by никита on 05.04.14.
 */
public class SummeryMerger implements IMerger<Integer> {
    @Override
    public Integer merge(Integer input1, Integer input2) {

        return input1+input2;
    }

}
