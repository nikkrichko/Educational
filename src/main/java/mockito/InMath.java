package mockito;

/**
 * Created by никита on 22.02.14.
 */
public class InMath {


    private int a;
    private int b;
    private int summ;
    private int razn;

    public InMath(OutMath outMath) {
        this.a = outMath.getA();
        this.b = outMath.getB();
    }

    public int summ(){
        return a+b;
    }

    public int razn(){
        return a-b;
    }

    public void print(){
        System.out.println("SUMM" + summ);
        System.out.println("RAZN" + razn);
    }

}
