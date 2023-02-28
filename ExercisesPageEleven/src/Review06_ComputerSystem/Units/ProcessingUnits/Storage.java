package Review06_ComputerSystem.Units.ProcessingUnits;

import Review06_ComputerSystem.Units.ProcessingUnit;
import Review06_ComputerSystem.Units.UnitType;

import java.time.Instant;

public class Storage extends ProcessingUnit {
    public Storage(String name, Integer serialNumber, Instant manufacturingDate, UnitType unitType) {
        super(name, serialNumber, manufacturingDate, unitType);
    }
}
