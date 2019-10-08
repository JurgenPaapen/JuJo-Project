package clockyourhours.DomainModelLayer;

import java.util.Collection;

public class Project {

	Collection<User> user;
	Client client;
	Collection<Task> taskProject;
	Collection<Task_Project> task_Project;
	private int ID;
	private String type;
	private String name;

	public Project() {
		// TODO - implement Project.Project
		throw new UnsupportedOperationException();
	}

}