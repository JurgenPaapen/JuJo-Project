package clockyourhours.DomainModelLayer;
import java.io.Serializable;
import java.util.*;

public class Project implements employeeCosts, Serializable {
	private String projectName;
	private List<Task> tasks = new ArrayList<>();
	private Client clientForThisProject;


    public Project(String name, Client clientForThisProject) {
        this.projectName = name;
        this.clientForThisProject = clientForThisProject;
    }

    //	public Project(String name) {
//		this.name = name;
//		this.tasks = new ArrayList<>();
//	}


	public void addTask(Task task){
		tasks.add(task);
	}

	public List getTask(){
        return tasks;
    }

    public void printTaskList() {
        System.out.println("You have " + tasks.size() + " items in your task list");
        for(int i=0; i< tasks.size(); i++) {
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }


	@Override
	public String toString() {

	    return projectName.toUpperCase();

	}

    @Override
    public void setCostCalculation() {

    }
}