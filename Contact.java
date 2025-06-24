package main.java;

// Contact Object
public class Contact {
	// declaring as final to ensure contact id is assigned only once
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String phoneNum, String address) {
		if (contactId == null || contactId.length()>10)
		{
			throw new IllegalArgumentException("Invalid id");
			}
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if (phoneNum == null || phoneNum.length()>10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if (address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
		}
	
	
	// Getters and Setters
	public String getContactId() {return contactId; }
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName; 
	}
	public String getFirstName() {return firstName; }
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName; 
	}
	public String getLastName() {return lastName; }
	public void setPhoneNum(String phoneNum) {
		if (phoneNum == null || phoneNum.length()>10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.phoneNum = phoneNum; 
	}
	public String getPhoneNum() {return phoneNum; }
	public void setAddress(String address) {
		if (address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address; 
	}
	public String getAddress() {return address; }
}
