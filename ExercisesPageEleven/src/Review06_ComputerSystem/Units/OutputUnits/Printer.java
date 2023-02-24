package Review06_ComputerSystem.Units.OutputUnits;

import Review06_ComputerSystem.Units.OutputUnit;
import Review06_ComputerSystem.Units.UnitType;

import java.time.Instant;
import java.util.Objects;

public class Printer extends OutputUnit {
    public Printer(String name, Integer serialNumber, Instant manufacturingDate, UnitType unitType) {
        super(name, serialNumber, manufacturingDate, unitType);
    }

    private String printerOutput;

    public String getPrinterOutput() {
        return printerOutput;
    }

    public void setPrinterOutput(String printerOutput) {
        this.printerOutput = printerOutput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Printer printer = (Printer) o;
        return Objects.equals(getPrinterOutput(), printer.getPrinterOutput());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrinterOutput());
    }

    @Override
    public String toString() {
        return "Printer{" +
                "printerOutput='" + printerOutput + '\'' +
                '}';
    }
}
