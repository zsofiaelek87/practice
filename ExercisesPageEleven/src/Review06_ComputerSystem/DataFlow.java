package Review06_ComputerSystem;

import Review06_ComputerSystem.Units.InputUnit;
import Review06_ComputerSystem.Units.OutputUnit;

public class DataFlow<INPUT extends InputUnit, OUTPUT extends OutputUnit> {

    private final INPUT input;
    private final OUTPUT output;

    public DataFlow(INPUT input, OUTPUT output) {
        this.output = output;
        this.input = input;
    }

    public void execute(){
        String s =  input.process();
        output.process(s);
    }
}
