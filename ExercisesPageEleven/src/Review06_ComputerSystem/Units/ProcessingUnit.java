package Review06_ComputerSystem.Units;

import java.time.Instant;

public abstract class ProcessingUnit extends Unit{


    public ProcessingUnit(String name, Integer serialNumber, Instant manufacturingDate, UnitType unitType) {
        super(name, serialNumber, manufacturingDate, unitType);
        this.unitType = UnitType.PROCESSING;
    }
}
