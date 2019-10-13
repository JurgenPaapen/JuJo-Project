package clockyourhours.DomainModelLayer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Client {
		private Project projects;
		private int ID;
		private String companyName;
		private String address;
		private String zipCode;
		private String city;
		private String country;
		private String email;
		Project name;

	public Client( Project projects, int ID, String companyName, String address, String zipCode, String city, String country, String email) {
		this.ID = ID;
		this.companyName = companyName;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
		this.email = email;
		this.projects = projects;

	}

//    public void addProject(Project name){
//	    projects.addProject(name);
//    }

    public Project getProjects() {
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



