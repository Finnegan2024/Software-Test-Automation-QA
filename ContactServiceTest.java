package test.java;

import main.java.Contact;
import main.java.ContactService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
	private ContactService service;
	private Contact contact;
	
	
	// setting up service and contact objects before each test case
	@BeforeEach
	void setUp() {
		service = new ContactService();
		contact = new Contact("FT2000", "Finn", "Thomas", "3174428639", "100 Apple Street");
		service.addContact(contact);
	}
	
	@Test
	public void testAddContact() {
		Contact newContact = new Contact("0001", "Jane", "Doe", "3178675309", "500 Cherry Dr");
		assertTrue(service.addContact(newContact));
	}
	
	@Test
	public void testRemoveContact() {
		assertTrue(service.deleteContact("0001"));
	}
	
	@Test
	public void testUpdateFirstName() {
		assertTrue(service.updateFirstName("FT2000", "Finnegan"));
	}
	
	@Test
	public void testUpdateLastName() {
		assertTrue(service.updateLastName("FT2000", "Tommy"));
	}
	
	@Test
	public void testUpdatePhoneNum() {
		assertTrue(service.updatePhoneNum("FT2000", "3172709707"));
	}
	
	@Test
	public void testUpdateAddress() {
		assertTrue(service.updateAddress("FT2000", "900 Orange Circle"));
	}
	
	@Test
	public void testAddNullContactThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> service.addContact(null));
	}
	
	@Test
	public void testAddExistingContactThrowsException() {
		Contact anotherContact = new Contact("FT2000", "Finnegan", "Tommy", "3172709707", "900 Orange Circle");
		assertThrows(IllegalArgumentException.class, () -> service.addContact(anotherContact));
	}
	
	@Test
	public void testDeleteContactThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> service.deleteContact(null));
	}
	
	@Test
	public void testUpdateNullFirstNameThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> service.updateFirstName(null, "Gary"));
	}
	
	@Test
	public void testUpdateNullLastNameThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> service.updateLastName(null, "Gary"));
	}
	
	@Test
	public void testUpdateNullPhoneNumThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> service.updatePhoneNum(null, "9889886565"));
	}
	
	@Test
	public void testUpdateNullAddressThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> service.updateFirstName(null, "6225 Forever Way"));
	}

}
