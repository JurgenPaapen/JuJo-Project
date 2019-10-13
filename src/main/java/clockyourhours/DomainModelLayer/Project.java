package clockyourhours.DomainModelLayer;
import java.lang.reflect.Array;
import java.util.*;

public class Project {
	private  String name;
	private List<String> taskProject;

	public Project(String name, String tasks) {
		this.name = name;
		this.taskProject = new ArrayList<>();
	}

	public void addTask(String name){
		taskProject.add(name);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Project{" +
				"name='" + name + '\'' +
				", taskProject=" + taskProject +
				'}';
	}

//	public List<Task> getTasks() {
//		return taskProject;
//	}

}