package Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import address.data.AddressBook;


public class AddressBookTest {

    private AddressBook addressBook;


    @BeforeEach
    public void setUp() {
        addressBook = AddressBook.getInstance();
    }


    @Test
    void testAdd() {
        addressBook.add("Luis", "Mario", "Calle", "Acayucan", "Veracruz", 96737, "correo@gmail.com", "12345678910");
        assertEquals(1, addressBook.getEntries().size());
    }


    @Test
    void testFind() {
        addressBook.add("Luis", "Mario", "Calle", "Acayucan", "Veracruz", 96737, "correo@gmail.com", "12345678910");
        addressBook.add("Mario", "Hugo", "Calle", "Minatitlan", "Veracruz", 90000, "correo2@gmail.com", "12345678910");
        addressBook.find("S");
        assertEquals(2, addressBook.getEntries().size());
    }


    @Test
    void testGetEntries() {
        assertNotNull(addressBook.getEntries());
    }

    @Test
    void testGetInstance() {
        AddressBook instance1 = AddressBook.getInstance();
        AddressBook instance2 = AddressBook.getInstance();
        assertEquals(instance1, instance2);
    }


    @Test
    void testReadFromFile() {
        addressBook.readFromFile("Prueba.txt");
        assertEquals(1, addressBook.getEntries().size());
    }


    @Test
    void testRemove() {
        addressBook.add("Luis", "Mario", "Calle", "Acayucan", "Veracruz", 96737, "correo@gmail.com", "12345678910");
        addressBook.remove("Mario");
        assertEquals(0, addressBook.getEntries().size());
    }


    @Test
    void testSaveToFile() {
        addressBook.add("Luis", "Mario", "Calle", "Acayucan", "Veracruz", 96737, "correo@gmail.com", "12345678910");
        addressBook.add("Mario", "Hugo", "Calle", "Minatitlan", "Veracruz", 90000, "correo2@gmail.com", "12345678910");
        addressBook.show();
        assertEquals(2, addressBook.getEntries().size());
    }

    @Test
    void testSeek() {
        addressBook.add("Luis", "Mario", "Calle", "Acayucan", "Veracruz", 96737, "correo@gmail.com", "12345678910");
        addressBook.seek("Mari");
        assertEquals(1, addressBook.getEntries().size());
    }


    @Test
    void testShow() {
        addressBook.add("Luis", "Mario", "Calle", "Acayucan", "Veracruz", 96737, "correo@gmail.com", "12345678910");
        addressBook.add("Mario", "Hugo", "Calle", "Minatitlan", "Veracruz", 90000, "correo2@gmail.com", "12345678910");
        addressBook.show();
        assertEquals(2, addressBook.getEntries().size());
    }
}
}
