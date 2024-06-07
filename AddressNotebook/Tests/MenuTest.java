package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import address.data.*;
import address.Menu;


public class MenuTest {

    private AddressBook menuBook;
    private Menu menu;

    @BeforeEach
    void setUp() {
        menuBook = AddressBook.getInstance();
        menu = new Menu(menuBook);
    }


    @Test
    void testAddCheck() {
        menu.addCheck("Mario", "Hugo", "Calle", "Minatitlan", "Veracruz", 90000, "correo2@gmail.com", "12345678910");
        assertTrue(menu.contactExists("Mario", "Hugo"), "El contacto fue agregado");
    }

    @Test
    void testContactExists() {
        menuBook.add("Luis", "Mario", "Calle", "Acayucan", "Veracruz", 96737, "correo@gmail.com", "12345678910");
        assertTrue(menu.contactExists("Luis", "Mario"), "Existe");
        assertFalse(menu.contactExists("Mario", "Hugo"), "Existe");
    }
}