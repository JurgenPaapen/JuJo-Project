package clockyourhours.DomainModelLayer;
import java.lang.reflect.Array;
import java.util.*;

public class Project {
	private String name;
	private Project project;

	public Project(String name, String tasks) {
		this.name = name;

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
				", taskProject=" + project +
				'}';
	}

//	public List<Task> getTasks() {
//		return taskProject;
//	}

}