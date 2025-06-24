package test.java;


import main.java.Contact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

// contact object test suite
public class ContactTest {
	private Contact contact;
	
	// sets up a contact object to test against each test case
	@BeforeEach
	void setUp() {
		contact = new Contact("FT2000", "Finn", "Thomas", "3174428639", "100 Apple Street");
	}
	
	@Test
	void testValidInputs() {
		assertEquals("FT2000", contact.getContactId());
		assertEquals("Finn", contact.getFirstName());
		assertEquals("Thomas", contact.getLastName());
		assertEquals("3174428639", contact.getPhoneNum());
		assertEquals("100 Apple Street", contact.getAddress());
	}
	
	@Test
	void testSetFirstName() {
		contact.setFirstName("Finnegan");
		assertEquals("Finnegan", contact.getFirstName());
	}
	
	@Test
	void testSetLastName() {
		contact.setLastName("Tommy");
		assertEquals("Tommy", contact.getLastName());
	}
	
	@Test
	void testSetPhoneNum() {
		contact.setPhoneNum("3172709707");
		assertEquals("3172709707", contact.getPhoneNum());
	}
	
	@Test
	void testSetAddress() {
		contact.setAddress("200 Maple Dr");
		assertEquals("200 Maple Dr", contact.getAddress());
	}
	
	@Test
	void testInvalidNullIdThrowsException() {
		// checking for exception and verifying correct message with assertEquals
		Exception exception = assertThrows(IllegalArgumentException.class,
				() -> new Contact(null, "Finn", "Thomas", "3174428639", "100 Apple Street"));
		assertEquals("Invalid id", exception.getMessage());
	}
	
	@Test
	void testSetInvalidFirstNameThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
	}
	
	@Test
	void testSetInvalidLastNameThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> contact.setLastName(null));
	}
	
	@Test
	void testSetInvalidPhoneNumThrowsException() {
		assertThrows(IllegalArgumentException.class,() -> contact.setPhoneNum(null));
	}
	
	@Test
	void testSetInvalidAddressThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null));
	}
	
	@Test
	void testSetIdTooLongThrowsException() {
		Exception exception = assertThrows(IllegalArgumentException.class,
				() -> new Contact("12345678910", "Finn", "Thomas", "3174428639", "100 Apple Street"));
		assertEquals("Invalid id", exception.getMessage());
	}
	
	@Test
	void testSetFirstNameTooLongThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> contact.setFirstName("Bartholomieu"));
	}
	
	@Test
	void testSetLastNameTooLongThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> contact.setLastName("Merryweather"));
	}
	
	@Test
	void testSetPhoneNumTooLongThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNum("13174428639"));
	}
	
	@Test
	void testSetAddressTooLongThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> contact.setAddress("This address is way too long to be valid."));
	}
}
