package Review06_ComputerSystem.Units;

import java.time.Instant;

public abstract class Unit {
    private String name;
    private Integer serialNumber;
    private Instant manufacturingDate;
    public UnitType unitType;

    public Unit(String name, Integer serialNumber, Instant manufacturingDate, UnitType unitType) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.manufacturingDate = manufacturingDate;
        this.unitType = unitType;
    }
}
