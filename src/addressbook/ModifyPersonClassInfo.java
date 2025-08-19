package addressbook;

import java.util.List;
import java.util.Scanner;

public class ModifyPersonClassInfo {
    Scanner scan = new Scanner(System.in);

    public boolean updatePerson(String firstName) {
        Contact person = new Contact();
        System.out.println("Enter person Last Name: ");
        person.setLastName(scan.next());
        System.out.println("Enter person city : ");
        person.setCity(scan.next());
        System.out.println("Enter person state Name: ");
        person.setState(scan.next());
        System.out.println("Enter person Address Name: ");
        person.setAddress(scan.next());
        System.out.println("Enter person Zip code: ");
        person.setZipCode(scan.nextInt());
        System.out.println("Enter person Phone number : ");
        person.setPhoneNumber(scan.nextLong());
        System.out.println("Enter person email : ");
        person.setEmail(scan.next());

        return false;
    }
    public boolean deletePerson(String firstName) {
        System.out.println("No such person not available with name of : " + firstName);
        return false;
    }
}
