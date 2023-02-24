package Review06_ComputerSystem.Units.InputUnits;

import Review06_ComputerSystem.Units.InputUnit;
import Review06_ComputerSystem.Units.UnitType;

import java.time.Instant;

public class Microphone extends InputUnit {
    public Microphone(String name, Integer serialNumber, Instant manufacturingDate) {
        super(name, serialNumber, manufacturingDate);
    }

    @Override
    public String process() {
        return "Microphone is processing 1 2 1 2";
    }
}
