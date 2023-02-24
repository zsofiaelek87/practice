package Review06_ComputerSystem.Units;

import java.time.Instant;

public abstract class OutputUnit extends Unit {

    public OutputUnit(String name, Integer serialNumber, Instant manufacturingDate) {
        super(name, serialNumber, manufacturingDate, UnitType.OUTPUT);
    }

    public abstract void process(String input);
}
