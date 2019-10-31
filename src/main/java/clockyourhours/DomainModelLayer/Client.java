package clockyourhours.DomainModelLayer;

import clockyourhours.Main.DataIO;

import java.io.File;
import java.io.Serializable;
import java.util.*;


public class Client extends Company implements Serializable {


		private int ID;
		private String companyName;
        private List<Project> projects = new ArrayList<>();
        private long serialVersionUID = 1L;

    public Client(String address, String zipCode, String city, String country, String email, int ID, String companyName, List<Project> projects) {
        super(companyName, address, zipCode, city, country, email);
        this.companyName = companyName;
        this.ID = ID;
        this.projects = projects;
    }

    public Client(int ID, String companyName, String address, String zipCode, String city, String country, String email) {
        super(companyName, address, zipCode, city, country, email);
        this.companyName = companyName;
        this.ID = ID;
	}



    public static void main(String[] args) {

/**
 * code which we used to export to the file It contains client data and connected projects and tasks within those projects.
 * <p>
 * timer test to see whether methods in other package and other classes can be reached from the main class
 * We will not implement this method in the final application but will use this code in the UI
 */

        Client c1 =  new Client(1, "Jansen Bouw", "Mary Zeldenrustlaan 165", "5122CH", "Rijen", "Netherlands", "joostoomen@hotmail.com");
        Project p1 = new Project("Dakkapel", c1);
        Task p1_task1 = new Task("opbouw", 25);
        p1.addTask(p1_task1);
        Task p1_task2 = new Task("afwerking", 45);
        p1.addTask(p1_task2);

        Project p2 = new Project("Tuinhuis", c1);
        Task p2_task1 = new Task("grondwerk", 25);
        p2.addTask(p2_task1);
        Task p2_task2 = new Task("opbouw", 45);
        p2.addTask(p2_task2);

        c1.addProject(p1);
        c1.addProject(p2);


        Client c2 = new Client(2, "fritsen Bouw", "Mary kees 165", "8765GB", "Groningen", "Netherlands", "fritsen@hotmail.com");
        Project c2_p1 = new Project("Keuken", c2);
        Task c2_p1_task1 = new Task("afwerking", 35);
        c2_p1.addTask(c2_p1_task1);
        Task c2_p1_task2 = new Task("inmeten", 35);
        c2_p1.addTask(c2_p1_task2);

        Project c2_p2 = new Project("Kozijnen", c2);
        Task c2_p2_task1 = new Task("inmeten", 95);
        c2_p2.addTask(c2_p2_task1);
        Task c2_p2_task2 = new Task("plaatsen", 65);
        c2_p2.addTask(c2_p2_task2);

        c2.addProject(c2_p1);
        c2.addProject(c2_p2);

        Client c3 = new Client(3, "Paapen Electra", "Mary truus 165", "4876PL", "Kaatsheuvel", "Netherlands", "Paapen@hotmail.com");
        Project c3_p1 = new Project("Domotica", c3);
        Task c3_p1_task1 = new Task("voorlichting", 125);
        c3_p1.addTask(c3_p1_task1);
        Task c3_p1_task2 = new Task("hulp op afstand", 90);
        c3_p1.addTask(c3_p1_task2);

        Project c3_p2 = new Project("Meterkast", c3);
        Task c3_p2_task1 = new Task("hoofdschakelaar omzeilen", 85);
        c3_p2.addTask(c3_p2_task1);
        Task c3_p2_task2 = new Task("wietplantage aanleggen", 145);
        c3_p2.addTask(c3_p2_task2);

        c3.addProject(c3_p1);
        c3.addProject(c3_p2);

       ArrayList<Client> clients = new ArrayList<>(Arrays.asList(c1,c2,c3));

        /**
         * Read and write path directory for file with data
         */

        File tempFile = new File("txtfiles/", "tempfile.obj");
        String tempFilePath = tempFile.getAbsolutePath();


        /**
         * Code we used to write the data to a file
         */

        System.out.println(tempFilePath);
        DataIO.writeToObjectFile(tempFilePath, clients);
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
        return this.companyName;
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
                ", companyName='" + super.companyName + '\'' +
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



