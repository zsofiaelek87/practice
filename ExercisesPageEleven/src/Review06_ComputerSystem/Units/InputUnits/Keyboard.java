package Review06_ComputerSystem.Units.InputUnits;

import Review06_ComputerSystem.Units.InputUnit;
import Review06_ComputerSystem.Units.UnitType;

import java.time.Instant;
import java.util.Objects;

public class Keyboard extends InputUnit {

    public Keyboard(String name, Integer serialNumber, Instant manufacturingDate) {
        super(name, serialNumber, manufacturingDate);
    }

    @Override
    public String process() {
        String copy = new String(keyboardInput);
        keyboardInput="";
        return copy;
    }

    public void pressCharacter(String letter){
        keyboardInput+=letter;
    }

    private String keyboardInput;

    public String getKeyboardInput() {
        return keyboardInput;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keyboard keyboard = (Keyboard) o;
        return Objects.equals(keyboardInput, keyboard.keyboardInput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyboardInput);
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardInput='" + keyboardInput + '\'' +
                '}';
    }
}
