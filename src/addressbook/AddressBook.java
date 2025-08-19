package addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBook {
    private static Map<String, List<Contact>> addressBooks = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        List<Contact> contactList = new ArrayList<>();

        ModifyPersonClassInfo personClassInfo = new ModifyPersonClassInfo();
        AddPerson addPerson = new AddPerson();
        Contact person = addPerson.addContact();
        contactList.add(person);
        addressBooks.put("Book1", contactList);
        personClassInfo.updatePerson(addressBooks);
    }
}
