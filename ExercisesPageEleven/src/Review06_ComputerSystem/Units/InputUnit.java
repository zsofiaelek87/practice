package Review06_ComputerSystem.Units;

import java.time.Instant;

public abstract class InputUnit extends Unit {

    public InputUnit(String name, Integer serialNumber, Instant manufacturingDate) {
        super(name, serialNumber, manufacturingDate, UnitType.INPUT);
    }

    public abstract String process();
}
