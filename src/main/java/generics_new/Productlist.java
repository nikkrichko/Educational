package generics_new;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by никита on 08.02.14.
 */
public class Productlist <T>  {

    private List<T> list = new ArrayList<>();

    public void add(T e){
        list.add(e);
    }

    public void count(){
        System.out.println(list.size());
    }

    public T get(int i) {
        return list.get(i);
    }

    public void print(){
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        String ireland;
        Productlist<String> productlist = new Productlist<>();
        Productlist productlist2 = (Productlist) productlist;
        productlist2.add(2);

        productlist.add("Hello world");

        productlist.add("HELLO IRELAND");
        // productlist.add(5);
        productlist.count();
        System.out.println(productlist.get(1));
        // ireland = productlist.get(2);
        productlist.print();
    }

}
