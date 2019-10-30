package clockyourhours.DomainModelLayer;

import java.util.Collection;

public class User extends Company {

	private int ID;
	private String firstName;
	private String lastName;
	private Integer phoneNumber;
	private String VATNumber;
	private Integer KVKNumber;


	public User(String companyName, String address, String zipCode, String city, String country, String email, Collection<Project> projectID2, Collection<Project> project, int ID, String firstName, String lastName, String address1, String houseNumber, String zippCode, String city1, Integer phoneNumber, String email1, String VATNumber, Integer KVKNumber, String companyName1) {
		super(companyName, address, zipCode, city, country, email);
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.VATNumber = VATNumber;
		this.KVKNumber = KVKNumber;

	}

	public void deleteClient() {
		// TODO - implement User.deleteClient
		throw new UnsupportedOperationException();
	}

	public void addClient() {
		// TODO - implement User.addClient
		throw new UnsupportedOperationException();
	}

	public void deleteTask() {
		// TODO - implement User.deleteTask
		throw new UnsupportedOperationException();
	}

	public void addTask() {
		// TODO - implement User.addTask
		throw new UnsupportedOperationException();
	}

	public void editTask() {
		// TODO - implement User.editTask
		throw new UnsupportedOperationException();
	}



	public void editClient() {
		// TODO - implement User.editClient
		throw new UnsupportedOperationException();
	}

	public void editRegistration() {
		// TODO - implement User.editRegistration
		throw new UnsupportedOperationException();
	}

	public User() {
		super();
		// TODO - implement User.User
		throw new UnsupportedOperationException();
	}

}