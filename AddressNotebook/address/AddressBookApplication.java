package address;

import address.data.*;
import java.util.Scanner;

/**
 * Clase principal para la aplicación.
 */
public class AddressBookApplication {

    //Método para ejecutar la aplicación del libro de direcciones.
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressEntries = AddressBook.getInstance();
        Menu start = new Menu(addressEntries);
        boolean runProgram = true;

        while (runProgram) {
            start.displayMenu();
            String userEntry = scanner.nextLine();

            switch (userEntry) {

                //Caso de añadir nuevo registro
                case "a":
                    System.out.println("Please, enter the contact details / Por favor, ingrese los datos de contacto");
                    
                    System.out.println("First name / Primer nombre: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Last name / Apellido: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Street / Calle: ");
                    String street = scanner.nextLine();
                    System.out.println("City / Ciudad: ");
                    String city = scanner.nextLine();
                    System.out.println("State / Estado: ");
                    String state = scanner.nextLine();
                    System.out.println("Zip Code / Código postal: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a valid Zip Code+"+
                                           "\nEntrada incorrecta, por favor ingrese un código postal válido:");
                        scanner.next();
                    }
                    int zipCode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Email/ Correo electrónico: ");
                    String email = scanner.nextLine();
                    System.out.println("Phone number / Número de teléfono: ");
                    String phoneNumber = scanner.nextLine();

                    if (!start.entryExists(firstName, lastName)) {

                        start.addCheck(firstName, lastName, street, city, state, zipCode, email, phoneNumber);
                        AddressEntry tempEntry = new AddressEntry(firstName, lastName, street, city, state, zipCode, email, phoneNumber);
                        boolean savingBucle = true;

                        do {
                            System.out.println("Would you like to save this entry into a text file? y/n \n"+ 
                                                "¿Deseas guardar esta entrada en un archivo de texto? s/n");
                            char confirmation = scanner.next().charAt(0);
                            scanner.nextLine();

                            switch(confirmation){
                                case'y':
                                addressEntries.saveToFile(tempEntry);
                                System.out.println("This entry has been saved to .txt file."+
                                                   "\nEsta entrada ha sido guardada en un archivo .txt");
                                savingBucle = false;
                                break;

                                case's':
                                addressEntries.saveToFile(tempEntry);
                                System.out.println("This entry has been saved to .txt file."+
                                                   "\nEsta entrada ha sido guardada en un archivo .txt");
                                savingBucle = false;
                                break;

                                case'n':
                                addressEntries.saveToFile(tempEntry);
                                System.out.println("This entry has not been saved, it will lose when the program ends."+
                                                   "\nEsta entrada no ha sido guardada, se perderá cuando el programa termine.");
                                savingBucle = false;
                                break;
                            
                                default:
                                System.out.println("Please choose one of the valid options.\nPor favor elige una de las opciones validas.");
                                break;
                            }
                        } while (savingBucle); 
                    } else {
                        System.out.println("That contact has already been added.\nEse contacto ya fue añadido.");
                    }
                    break;

                //Caso de cargar registro desde archivo   
                case "b":
                    System.out.println("Enter the file name");
                    String fileName = scanner.nextLine();
                    addressEntries.readFromFile(fileName);
                    break;

                //Caso de buscar registro
                case "c":
                    System.out.println("Enter a last name or the start of a last name\nIngresa un apellido o el comienzo de un apellido: ");
                    String startOfLastName = scanner.nextLine();
                    addressEntries.find(startOfLastName);
                    break;
                
                //Caso de eliminar registro
                case "d":
                    //Buscar registro a eliminar
                    System.out.println("Enter the contact last name you want to erase\nIngresa el apellido del contacto que quieres eliminar: ");
                    String searchLastName = scanner.nextLine();
                    addressEntries.seek(searchLastName);
                    //Pregunta de seguridad para eliminar registro
                    System.out.println("Are you sure you wanna erase this contact? y/n \n"+
                                       "¿Estas seguro de eliminar este contacto? s/n");
                    char response = scanner.next().charAt(0);
                    scanner.nextLine();
                    //Casos para eliminar registro (aceptar)
                    if(response=='y'  ||  response=='s'){
                        addressEntries.erase(searchLastName);
                    }
                    else if(response=='n'){

                    }
                    switch(response){
                        case'y':
                        
                        break;

                        case's':
                        addressEntries.erase(searchLastName);
                        break;

                        case'n':
                        System.out.println("This entry remains in your contacts.\n Esta entrada permanece en tus contactos");
                        break;
                    
                        default:
                        System.out.println("Please choose one of the valid options.\nPor favor elige una de las opciones validas");
                        break;
                    }
                    break;

                
                case "e":
                    addressEntries.show();
                    break;
                case "f":
                    System.out.println("Goodbye!\nHasta luego!");
                    runProgram = false;
                    break;
                default:
                    System.out.println("Please choose one of the valid options.\nPor favor elige una de las opciones validas.");
            }
        }
        scanner.close();
    }
}