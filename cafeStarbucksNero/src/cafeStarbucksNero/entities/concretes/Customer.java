package cafeStarbucksNero.entities.concretes;

import cafeStarbucksNero.entities.abstracts.IEntities;

public class Customer implements IEntities {
	private int id;
	private String nationaltyId;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	public Customer() {
		
	}
	public Customer(int id, String nationaltyId, String firstName, String lastName, int dateOfBirth) {
		super();
		this.id = id;
		this.nationaltyId = nationaltyId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationaltyId() {
		return nationaltyId;
	}
	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
