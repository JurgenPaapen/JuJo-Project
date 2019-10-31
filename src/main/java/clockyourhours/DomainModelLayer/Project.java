package clockyourhours.DomainModelLayer;
import java.io.Serializable;
import java.util.*;

public class Project implements employeeCosts, Serializable {
	private String projectName;
	private List<Task> tasks = new ArrayList<>();
	private Client clientForThisProject;
    private long serialVersionUID = 1L;


    public Project(String name, Client clientForThisProject) {
        this.projectName = name;
        this.clientForThisProject = clientForThisProject;
    }


	public void addTask(Task task){
		tasks.add(task);
	}

    /**
     *
     * @return task of project
     */
	public List getTask(){
        return tasks;
    }

    public String getProjectName() {
        return projectName;
    }


	@Override
	public String toString() {

	    return projectName.toUpperCase();

	}

    @Override
    public Integer costCalculation() {


        return null;
    }
}