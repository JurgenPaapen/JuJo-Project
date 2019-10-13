package clockyourhours.DomainModelLayer;

import clockyourhours.project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Project {
	private  String name;
	private  List<String> projects;

	public Project(String name) {
		this.name = name;
		this.projects = new ArrayList<>();
	}

	public void addProject(String name){
		projects.add(name);
		System.out.println(projects);

	}

	public String getName() {
		return name;
	}
}