package generics;

/**
 * Created by никита on 04.01.14.
 */
public class Player implements IPlayerInformation {

    @Override
    public Player convertToPlayer() {
        return this;
    }
}
