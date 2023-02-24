package Review06_ComputerSystem;

import Review06_ComputerSystem.Units.InputUnits.Keyboard;
import Review06_ComputerSystem.Units.InputUnits.Microphone;
import Review06_ComputerSystem.Units.OutputUnits.Monitor;
import Review06_ComputerSystem.Units.ProcessingUnits.CentralProcessingUnit;
import Review06_ComputerSystem.Units.UnitType;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard("MyKeyboard", 12345, Instant.now());

        keyboard.pressCharacter("H");
        keyboard.pressCharacter("A");
        keyboard.pressCharacter("H");
        keyboard.pressCharacter("A");

        CentralProcessingUnit centralProcessingUnit = new CentralProcessingUnit("MyCPU", 12345, Instant.now(), UnitType.PROCESSING);


        String result = centralProcessingUnit.processingCPU(keyboard.getKeyboardInput());

        Monitor monitor = new Monitor("MyMonitor", 12345, Instant.now());

        DataFlow<Keyboard, Monitor> task1 = new DataFlow<>(keyboard, monitor);

        centralProcessingUnit.processTask(task1);

        Microphone microphone = new Microphone("MyMicrophone", 12345, Instant.now());


    }
}
