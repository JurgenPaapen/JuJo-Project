package clockyourhours.DomainModelLayer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Task {

	Collection<Project> project;
	Collection<Task_Project> task_Project;
	private int projectID;
	private String name;
	private Integer costPerHour;

	public Task(String name, List project)  {
			this.name = name;
	}

}