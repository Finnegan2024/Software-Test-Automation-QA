package main.java;

import java.util.HashMap;
import java.util.Map;

// contact service object
public class ContactService {
	// hashmap to hold contacts with fast lookup
	private Map<String, Contact> contacts = new HashMap<>();
	
	// using boolean values to align with real world business applications and to verify tests using assertTrue or assertFalse
	public boolean addContact(Contact contact) {
		if (contact == null) {
			throw new IllegalArgumentException("Contact & Contact ID cannot be null");
		}
		if (contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact ID already exists");
		}
		
		contacts.put(contact.getContactId(), contact);
		return true;
	}
	
	public boolean deleteContact(String contactId) {
		if (contactId == null) {
			throw new IllegalArgumentException("Contact ID cannot be null");
		}
		contacts.remove(contactId);
		return true;
	}
	
	public boolean updateFirstName(String contactId, String firstName) {
		Contact contact = contacts.get(contactId);
		if (contact == null) {
			throw new IllegalArgumentException("Contact ID not found");
		}
		contact.setFirstName(firstName);
		return true;
	}
	
	public boolean updateLastName(String contactId, String lastName) {
		Contact contact = contacts.get(contactId);
		if (contact == null) {
			throw new IllegalArgumentException("Contact ID not found");
		}
		contact.setLastName(lastName);
		return true;
	}
	
	public boolean updatePhoneNum(String contactId, String phoneNum) {
		Contact contact = contacts.get(contactId);
		if (contact == null) {
			throw new IllegalArgumentException("Contact ID not found");
		}
		contact.setPhoneNum(phoneNum);
		return true;
	}
	
	public boolean updateAddress(String contactId, String address) {
		Contact contact = contacts.get(contactId);
		if (contact == null) {
			throw new IllegalArgumentException("Contact ID not found");
		}
		contact.setAddress(address);
		return true;
	}
}
