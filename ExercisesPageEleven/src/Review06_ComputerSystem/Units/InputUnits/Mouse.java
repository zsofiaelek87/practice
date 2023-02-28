package Review06_ComputerSystem.Units.InputUnits;

import Review06_ComputerSystem.Units.InputUnit;
import Review06_ComputerSystem.Units.UnitType;

import java.time.Instant;
import java.util.Objects;

public class Mouse extends InputUnit {
    public Mouse(String name, Integer serialNumber, Instant manufacturingDate, UnitType unitType) {
        super(name, serialNumber, manufacturingDate);
    }

    private Boolean mouseClicked;

    public Boolean getMouseClicked() {
        return mouseClicked;
    }

    public void setMouseClicked(Boolean mouseClicked) {
        this.mouseClicked = mouseClicked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mouse mouse = (Mouse) o;
        return Objects.equals(mouseClicked, mouse.mouseClicked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mouseClicked);
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "mouseClicked=" + mouseClicked +
                '}';
    }

    @Override
    public String process() {
        return null;
    }
}
