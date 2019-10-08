package clockyourhours.DomainModelLayer;

import java.util.Collection;

public class Task {

	Collection<Project> project;
	Collection<Task_Project> task_Project;
	private int projectID;
	private String name;
	private Integer costPerHour;

	public Task() {
		// TODO - implement Task.Task
		throw new UnsupportedOperationException();
	}

}