package addressbook;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ModifyPersonClassInfo {
    Scanner scan = new Scanner(System.in);

    public boolean updatePerson(Map<String, List<Contact>> addressBooks) {
        System.out.println("Enter person First Name to update: ");
        String firstName = scan.next();
        boolean found = false;
        for (Map.Entry<String, List<Contact>> entry : addressBooks.entrySet()) {
            List<Contact> contactList = entry.getValue();
            for (int i = 0; i < contactList.size(); i++) {
                Contact contact = contactList.get(i);
                if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                    found = true;

                    Contact updatedContact = new Contact();
                    System.out.println("Enter new Last Name: ");
                    updatedContact.setLastName(scan.next());
                    System.out.println("Enter new City: ");
                    updatedContact.setCity(scan.next());
                    System.out.println("Enter new State: ");
                    updatedContact.setState(scan.next());
                    System.out.println("Enter new Address: ");
                    updatedContact.setAddress(scan.next());
                    System.out.println("Enter new Zip Code: ");
                    updatedContact.setZipCode(scan.nextInt());
                    System.out.println("Enter new Phone Number: ");
                    updatedContact.setPhoneNumber(scan.nextLong());
                    System.out.println("Enter new Email: ");
                    updatedContact.setEmail(scan.next());

                    // Preserve original first name
                    updatedContact.setFirstName(contact.getFirstName());

                    contactList.set(i, updatedContact);
                    System.out.println("Contact updated successfully.");

                }

            }
        }
        if (!found) {
            System.out.println("No contact found with the given first name.");
        }
        return false;
    }

    public boolean deletePerson(Map<String, List<Contact>> addressBooks, String firstName) {
        for (Map.Entry<String, List<Contact>> entry : addressBooks.entrySet()) {
            List<Contact> contactList = entry.getValue();
            for (int i = 0; i < contactList.size(); i++) {
                if (contactList.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                    contactList.remove(i);
                    System.out.println("Contact deleted successfully.");
                    return true;
                }
            }
        }
        System.out.println("No contact found with the name: " + firstName);
        return false;
    }
}
