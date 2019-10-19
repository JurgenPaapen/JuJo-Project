package clockyourhours.DomainModelLayer;

import java.io.Serializable;
import java.util.*;


public class Client implements Serializable {
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

    public int getID() {
        return ID;
    }

    /**
     * Add project to client
     * @param project
     */

    public void addProject(Project project){
	    projects.add(project);
    }

    /**
     * show all projects from client
     * @return
     */
    public List<Project> getProjects() {
        return projects;
    }

    /**
     *
     * @return companyname of client
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     *
     * @return emailAddress of client
     */
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

    /**
     * code to be sure 2 arraylists will be compared the right way (content and not location in memoty)
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return ID == client.ID &&
                Objects.equals(companyName, client.companyName) &&
                Objects.equals(address, client.address) &&
                Objects.equals(zipCode, client.zipCode) &&
                Objects.equals(city, client.city) &&
                Objects.equals(country, client.country) &&
                Objects.equals(email, client.email) &&
                Objects.equals(projects, client.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, companyName, address, zipCode, city, country, email, projects);
    }
}



