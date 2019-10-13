package clockyourhours.DomainModelLayer;
import java.lang.reflect.Array;
import java.util.*;

public class Project {
	private String name;
	private Project project;
	private Project projects;
	private ArrayList tasks;


	public Project(String name, ArrayList<String> tasks) {
		this.name = name;
		this.tasks = tasks;
	}


	public void addTask(String name){
		project.addTask(name);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Project{" +
				"name='" + name + '\'' +
				", task=" + tasks +
				'}';
	}

//	public List<Task> getTasks() {
//		return taskProject;
//	}

}