package Review05_Threads;

public class OddPrinter extends Printer{
    public OddPrinter() {
        super(1000);
    }

    @Override
    public boolean isValidInputToRun(int number) {
        return number%2 == 0;
    }
}
