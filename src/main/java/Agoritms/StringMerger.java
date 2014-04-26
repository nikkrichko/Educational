package Agoritms;

/**
 * Created by никита on 05.04.14.
 */
public class StringMerger implements IMerger<String> {
    @Override
    public String merge(String input1, String input2) {
        return input1 + " " + input2;
    }
}
