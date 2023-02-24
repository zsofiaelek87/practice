package Review05_Threads;

public class EvenPrinter extends Printer{
    public EvenPrinter() {
        super(2000);
    }

    @Override
    public boolean isValidInputToRun(int number) {
        return number%2 != 0;
    }
}
