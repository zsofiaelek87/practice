package Review06_ComputerSystem.Units.ProcessingUnits;

import Review06_ComputerSystem.DataFlow;
import Review06_ComputerSystem.Units.ProcessingUnit;
import Review06_ComputerSystem.Units.UnitType;

import java.time.Instant;

public class CentralProcessingUnit extends ProcessingUnit {
    public CentralProcessingUnit(String name, Integer serialNumber, Instant manufacturingDate, UnitType unitType) {
        super(name, serialNumber, manufacturingDate, unitType);
    }



    public String processingCPU(String inputCPU){
        return inputCPU.toString();
    }

    public void processTask(DataFlow<?,?> task){
        task.execute();
    }
}



