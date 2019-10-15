package clockyourhours.DomainModelLayer;

import java.util.ArrayList;
import java.util.HashMap;

public class Task implements employeeCosts {

	private String name;
	private Integer costPerHour;

    public Task(String name, Integer costPerHour) {
        this.name = name;
        this.costPerHour = costPerHour;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", costPerHour=" + costPerHour +
                '}';
    }

    @Override
    public void setCostCalculation() {

    }
}