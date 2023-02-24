package Review06_ComputerSystem.Units.OutputUnits;

import Review06_ComputerSystem.Units.OutputUnit;
import Review06_ComputerSystem.Units.UnitType;

import java.time.Instant;
import java.util.Objects;

public class Monitor extends OutputUnit {
    public Monitor(String name, Integer serialNumber, Instant manufacturingDate) {
        super(name, serialNumber, manufacturingDate);
    }


    @Override
    public void process(String input) {
        System.out.println(input);
    }


}
