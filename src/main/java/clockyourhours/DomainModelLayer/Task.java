package clockyourhours.DomainModelLayer;

public class Task {

	private int projectID;
	private String name;
	private Integer costPerHour;

	public Task(String name)  {
			this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Task{" +
				"name='" + name + '\'' +
				'}';
	}
}