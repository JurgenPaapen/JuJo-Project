package clockyourhours.DomainModelLayer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;


public class Client {
		Collection<Project> project;
		private int ID;
		private String companyName;
		private String address;
		private String zipCode;
		private String city;
		private String country;
		private String email;

	public Client(Collection<Project> project, int ID, String companyName, String address, String zipCode, String city, String country, String email) {
		this.project = project;
		this.ID = ID;
		this.companyName = companyName;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
		this.email = email;
	}
}