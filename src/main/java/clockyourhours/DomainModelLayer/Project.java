package clockyourhours.DomainModelLayer;
import java.lang.reflect.Array;
import java.util.*;

public class Project {
	private String name;
	private Project project;
	private Project projects;
	private List<String> tasks;
	private HashMap<String, Task> projectList = new HashMap<String, Task>();

//	public Project(String name) {
//		this.name = name;
//		this.tasks = new ArrayList<>();
//	}


//	public void addTask(String name){
//		project.addTask(name);
//	}

	public Project getProject() {
		return project;
	}

	public void addProject(String name, Task task) {

		projectList.put(name, task);
	}

	@Override
	public String toString() {
		return "Project {" +
				"name='" + projectList + '\'' +
				'}';
	}

}