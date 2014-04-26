package CompareWithOutCompare;


public class Main {
    public static void main(String[] args) {

        Comparator comparator = new Comparator();

        comparator.print(111, 111);

        comparator.print(20, 4);
        comparator.print(4, 20);

        comparator.print(21, 20);
        comparator.print(20, 21);
    }
}
