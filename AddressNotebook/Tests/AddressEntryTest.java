package Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import address.data.AddressEntry;


public class AddressEntryTest {

    @Test
    void testConstructorAndGetters() {
        AddressEntry entry = new AddressEntry("Gary", "Stu", "Calle ejemplo", "Cosoleacaque", "Veracruz", 12345, "gary@example.com", "1234567890");
        assertEquals("Luis", entry.getFirstName());
        assertEquals("Mario", entry.getLastName());
        assertEquals("Calle", entry.getStreet());
        assertEquals("Acayucan", entry.getCity());
        assertEquals("Veracruz", entry.getState());
        assertEquals(96737, entry.getZipCode());
        assertEquals("correo@gmail.com", entry.getEmail());
        assertEquals("12345678910", entry.getPhoneNumber());
    }

    @Test
    void testSetters() {
        AddressEntry entry = new AddressEntry();
        entry.setFirstName("Mario");
        entry.setLastName("Hugo");
        entry.setStreet("Calle");
        entry.setCity("Minatitlan");
        entry.setState("Veracruz");
        entry.setZipCode(90000);
        entry.setEmail("correo2@gmail.com");
        entry.setPhoneNumber("12345678910");
        assertEquals("Mario", entry.getFirstName());
        assertEquals("Hugo", entry.getLastName());
        assertEquals("Calle", entry.getStreet());
        assertEquals("Minatitlan", entry.getCity());
        assertEquals("Veracruz", entry.getState());
        assertEquals(90000, entry.getZipCode());
        assertEquals("correo2@gmail.com", entry.getEmail());
        assertEquals("12345678910", entry.getPhoneNumber());
    }


    @Test
    void testToString() {
        AddressEntry entry = new AddressEntry("Luis", "Mario", "Calle", "Acayucan", "Veracruz", 96737, "correo@gmail.com", "12345678910");
        String expectedString = "Luis\nMario\nCalle\nAcayucan\nVeracruz\n96737\n12345678910\nejemplo@gmail.com";
        assertEquals(expectedString, entry.toString());
    }
