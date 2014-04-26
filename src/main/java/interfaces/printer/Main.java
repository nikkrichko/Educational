package interfaces.printer;

import interfaces.printer.Printer;
import interfaces.printer.decorators.Diez;
import interfaces.printer.decorators.Line;
import interfaces.printer.decorators.Stars;


public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();

        Printer printerDiez = new Printer(new Diez());
        Printer printerLine = new Printer(new Line());
        Printer printerStars = new Printer(new Stars());


        printer.print("hello world");
        printerDiez.print("hello world");
        printerLine.print("hello world");
        printerStars.print("hello world");


    }
}
