package clockyourhours.DomainModelLayer;

import java.io.Serializable;


public class Task implements employeeCosts, Serializable {

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
    public void costCalculation() {

    }
}