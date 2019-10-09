package clockyourhours.DomainModelLayer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Task {

	Collection<Project> project;
	Collection<Task_Project> task_Project;
	private int projectID;
	private String name;
	private Integer costPerHour;

	public Task(String name, List project)  {
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			this.children = new ArrayList<>();
		}

		public void addChild(String name){
			children.add(name);
		}

		public List<String> getChildren() {
			return children;
		}

		public String getName() {
			return name;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public int getAge(){
			LocalDate now = LocalDate.now();
			int age = now.getYear() - dateOfBirth.getYear();

			return age;


		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Person person = (Person) o;
			return name.equals(person.name) &&
					Objects.equals(dateOfBirth, person.dateOfBirth);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, dateOfBirth);
		}
	}

}