package interfaces.printer;

/**
 * Created by никита on 03.01.14.
 */
public class Printer {
    private final ITextDecorator textDecorator;

    public Printer(ITextDecorator textDecorator) {
        this.textDecorator = textDecorator;
    }

    public Printer() {
        this.textDecorator = null;
    }

    public void print(String string){
        printLine();
        System.out.println(string);
        printLine();
    }

    private void printLine(){
        if (textDecorator !=null) {
            textDecorator.printLine();
        }
    }
}
