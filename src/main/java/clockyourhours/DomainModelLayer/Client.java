package clockyourhours.DomainModelLayer;

import clockyourhours.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;


public class Client {
		private int ID;
		private String companyName;
		private String address;
		private String zipCode;
		private String city;
		private String country;
		private String email;
        private List<Project> projects = new ArrayList<>();

	public Client(int ID, String companyName, String address, String zipCode, String city, String country, String email) {
		this.ID = ID;
		this.companyName = companyName;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
		this.email = email;
	}

    /**
     * Add project
     * @param project
     */

    public void addProject(Project project){
	    projects.add(project);
    }

    public List<Project> getProjects() {
        return projects;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "project=" + projects +
                ", ID=" + ID +
                ", companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}



