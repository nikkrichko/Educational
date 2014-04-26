package concurency;

import java.util.concurrent.Callable;

/**
 * Created by никита on 23.03.14.
 */
public class MySqrt implements Callable<Integer>{
    private int a;
    MySqrt(int a){
        this.a = a;
    }





    public void setA(int a) {
        this.a = a;
    }

    @Override
    public Integer call() throws Exception {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a *=a;
        return a;
    }
}
