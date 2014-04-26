package generics;

/**
 * Created by никита on 04.01.14.
 */
public class ArrayField<T extends IPlayerInformation> implements IField <T> {

    private T[][] playersArray;

    @Override
    public T get(int x, int y) {
        return playersArray[x][y];
    }

    public int size(){
        return playersArray.length;
    }

}
