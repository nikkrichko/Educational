package generics;

/**
 * Created by никита on 04.01.14.
 */
public class Main {
    public static void main(String[] args) {
        ArrayField<Player> arrayField = new ArrayField<Player>();
        arrayField.get(0, 0).convertToPlayer();
        ArrayField<BaseFieldAdapter> baseFieldAdapterArray = new ArrayField<BaseFieldAdapter>();
        baseFieldAdapterArray.get(0, 0).convertToPlayer();
    }
}
