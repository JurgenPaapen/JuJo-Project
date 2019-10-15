package clockyourhours.DomainModelLayer;

import java.util.ArrayList;
import java.util.HashMap;

public class Task implements employeeCosts {

	private String taskName;
	private Integer costPerHour;

    public Task(String name, Integer costPerHour) {
        this.taskName = name;
        this.costPerHour = costPerHour;
    }

    public String getTaskName() {
        return taskName;
    }

    public Integer getCostPerHour() {
        return costPerHour;
    }

    @Override
    public String toString() {
        return taskName + " kosten per uur " + costPerHour + "\n";
    }

    @Override
    public void setCostCalculation() {

    }
}