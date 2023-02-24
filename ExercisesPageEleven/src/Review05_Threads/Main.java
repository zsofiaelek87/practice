package Review05_Threads;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        EvenPrinter evenPrinter1 = new EvenPrinter();
        EvenPrinter evenPrinter2 = new EvenPrinter();
        EvenPrinter evenPrinter3 = new EvenPrinter();
        OddPrinter oddPrinter1 = new OddPrinter();
        OddPrinter oddPrinter2 = new OddPrinter();

        evenPrinter1.start();
        evenPrinter2.start();
        evenPrinter3.start();
        oddPrinter1.start();
        oddPrinter2.start();

        Thread t = new Thread(new EvenPrinter());
        t.start();
    }
}
