package clockyourhours.DomainModelLayer;
import java.lang.reflect.Array;
import java.util.*;

public class Project implements employeeCosts{
	private String name;
	private List<Task> tasks = new ArrayList<>();
	private Client clientForThisProject;

    public Project(String name, Client clientForThisProject) {
        this.name = name;
        this.clientForThisProject = clientForThisProject;
    }

    //	public Project(String name) {
//		this.name = name;
//		this.tasks = new ArrayList<>();
//	}


	public void addTask(Task task){
		tasks.add(task);
	}

    public void printTaskList() {
        System.out.println("You have " + tasks.size() + " items in your task list");
        for(int i=0; i< tasks.size(); i++) {
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }


	@Override
	public String toString() {
	    String result ="";
	    result += name + "\n";
        for (Task task : tasks) {
            result += task + "\n";
        }
		return result;
	}

    @Override
    public void setCostCalculation() {

    }
}