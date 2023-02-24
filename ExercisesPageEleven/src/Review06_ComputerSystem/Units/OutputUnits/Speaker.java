package Review06_ComputerSystem.Units.OutputUnits;

import Review06_ComputerSystem.Units.OutputUnit;
import Review06_ComputerSystem.Units.UnitType;

import java.time.Instant;
import java.util.Objects;

public class Speaker extends OutputUnit {
    public Speaker(String name, Integer serialNumber, Instant manufacturingDate, UnitType unitType) {
        super(name, serialNumber, manufacturingDate, unitType);
    }

    private String speakerOutput;

    public String getSpeakerOutput() {
        return speakerOutput;
    }

    public void setSpeakerOutput(String speakerOutput) {
        this.speakerOutput = speakerOutput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speaker speaker = (Speaker) o;
        return Objects.equals(getSpeakerOutput(), speaker.getSpeakerOutput());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeakerOutput());
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "speakerOutput='" + speakerOutput + '\'' +
                '}';
    }
}
