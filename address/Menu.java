package address;

import address.data.*;

/**
 * El menú para el usuario final con el que puede interactuar con el libro de direcciones.
 */
public class Menu {

    private AddressBook menuBook;

    /**
     * Constructor que inicializa el menú con un libro de direcciones.
     * El libro de direcciones a utilizar.
     @param menuBook */
     
    public Menu(AddressBook menuBook) {
        this.menuBook = menuBook;
    }

    /**
     * Muestra el menú con las opciones disponibles.
     */
    public void displayMenu() {
        System.out.println("◺_______________________________◿");
        System.out.println("Choose an option from the menu");
        System.out.println("a) Add / Añadir");
        System.out.println("b) Load from file / Cargar de archivo");
        System.out.println("c) Find / Encontrar");
        System.out.println("d) Erase / Eliminar");
        System.out.println("e) Show all entries / Mostrar todas las entradas");
        System.out.println("f) Quit program / Salir del programa");
        System.out.println("◺_______________________________◿");
    }

    /**
     * Verifica si un contacto existe en el libro de direcciones.
     * 
     * @param firstName El primer nombre del contacto.
     * @param lastName El apellido del contacto.
     * @return verdadero si el contacto existe, false en caso contrario.
     */
    public boolean entryExists(String firstName, String lastName) {
        for (AddressEntry tempEntry : menuBook.getEntries()) {
            if (tempEntry.getFirstName().equalsIgnoreCase(firstName) && tempEntry.getLastName().equalsIgnoreCase(lastName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Añade un contacto al libro de direcciones después de verificar si ya existe.
     * 
     * @param firstName El primer nombre del contacto.
     * @param lastName El apellido del contacto.
     * @param street La calle del contacto.
     * @param city La ciudad del contacto.
     * @param state El estado del contacto.
     * @param zipCode El código postal del contacto.
     * @param email La dirección de correo electrónico del contacto.
     * @param phoneNumber El número de teléfono del contacto.
     */
    public void addCheck(String firstName, String lastName, String street, String city, 
                        String state, int zipCode, String email, String phoneNumber) {
        try {
            if (!entryExists(firstName, lastName)) {
                menuBook.add(firstName, lastName, street, city, state, zipCode, email, phoneNumber);
                System.out.println("The contact was successfully added \n El contacto ha sido añadido exitosamente");
            } else {
                System.out.println("That contact has already been added \n Ese contacto ya fue añadido");
            }
        } catch (Exception e) {
            System.out.println("There was an error while adding the contact: \n Hubo un error mientras se añadía el contacto: \n" + e.getMessage());
        }
    }
}
