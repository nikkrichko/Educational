package generics;


public interface IField <T extends IPlayerInformation> {

    public T get(int x, int y);

}
