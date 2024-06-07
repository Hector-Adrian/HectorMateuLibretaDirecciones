package address.data;

/**
 * Representa una entrada de dirección en un directorio.
 */
public class AddressEntry {

    // Variables por las que se compone una entrada de directorio
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    private String phoneNumber;
    private String email;

    /**
     * Constructor vacío para crear una entrada de dirección vacía.
     */
    public AddressEntry() {

    }

    /**
     * Constructor parametrizado para crear una entrada de dirección con los datos proporcionados.
     * 
     * @param firstName Nombre de pila.
     * @param lastName Apellido.
     * @param street Calle.
     * @param city Ciudad.
     * @param state Estado.
     * @param zipCode Código postal.
     * @param email Dirección de correo electrónico.
     * @param phoneNumber Número de teléfono.
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zipCode, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    /**
     * Establece el nombre de pila.
     * 
     * @param firstName El nombre de pila.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * Obtiene el nombre de pila.
     * 
     * @return El nombre de pila.
     */
    public String getFirstName() {
        return firstName;
    }


     /**
     * Establece el apellido.
     * 
     * @param lastName El apellido.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Obtiene el apellido.
     * 
     * @return El apellido.
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * Establece la calle.
     * 
     * @param street La calle.
     */
    public void setStreet(String street) {
        this.street = street;
    }


    //Obtener caller
    public String getStreet() {
        return street;
    }


    /**
     * Establece la ciudad.
     * 
     * @param city La ciudad.
     */
    public void setCity(String city) {
        this.city = city;
    }


    //Obtener la ciudad.
    public String getCity() {
        return city;
    }


    /**
     * Establece el estado.
     * 
     * @param state El estado.
     */
    public void setState(String state) {
        this.state = state;
    }


    //Obtener estado
    public String getState() {
        return state;
    }


    /**
     * Establece el código postal.
     * 
     * @param zipCode El código postal.
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }


    //Obetener codigo postal
    public int getZipCode() {
        return zipCode;
    }


    /**
     * Establece el número de teléfono.
     * 
     * @param phoneNumber El número de teléfono.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    //Obtener número de telefono
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Establece la dirección de correo electrónico.
     * 
     * @param email La dirección de correo electrónico.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    //Obtener correo electronico
    public String getEmail() {
        return email;
    }

    /**
     * Retorna una representación en cadena de la entrada de dirección.
     * 
     * @return Una cadena que contiene todos los campos de la entrada de dirección.
     */
    @Override
    public String toString() {
        return getFirstName() + "\n" + getLastName() + "\n" + getStreet() + "\n" + getCity() + "\n" + getState() + "\n" + getZipCode() + "\n" + getPhoneNumber() + "\n" + getEmail();
    }
}
