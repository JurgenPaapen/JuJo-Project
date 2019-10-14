package clockyourhours.DomainModelLayer;

import java.util.ArrayList;
import java.util.HashMap;

public class Task {

	private int projectID;
	private String name;
	private Integer costPerHour;
	private HashMap<String, Integer> tasklist = new HashMap<String, Integer>();

	public void addTask(String name, int costPerHour) {

		tasklist.put(name, costPerHour);
	}

	public HashMap<String, Integer> getTaskList() {
		return tasklist;
	}

	public void printTaskList() {
		System.out.println("You have " + tasklist.size() + " items in your task list");
		for(int i=0; i< tasklist.size(); i++) {
			System.out.println((i+1) + ". " + tasklist.get(i));
		}
	}

	@Override
	public String toString() {
		return "Task{" +
				 tasklist +
				'}';
	}
}