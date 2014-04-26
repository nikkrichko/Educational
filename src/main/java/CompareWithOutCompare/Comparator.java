package CompareWithOutCompare;

import java.util.TreeSet;

/**
 * Created by никита on 11.01.14.
 */
public class Comparator {
    TreeSet<Integer> set = new TreeSet<Integer>();

    public boolean comparator(int x, int y){
        for (int i = 0; i <= x; i++){
            set.add(i);
        }
        for (int i = y; i >= 0; i-- ){
            if (set.isEmpty()) {
                return false;
            }
            set.remove(set.last());
        }

        if (set.isEmpty()){
            return true;
        }
        return false;
    }

    public void print(int x, int y){
        if (comparator(x, y)) {
            System.out.println("equal");
        }
        else {
            System.out.println("NON equal");
        }
        set.clear();
    }

}
