package addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        List<Contact> contactList = new ArrayList<>();
        ModifyPersonClassInfo personClassInfo=new ModifyPersonClassInfo();
        AddPerson addPerson = new AddPerson();
        Contact person = addPerson.addContact();
        contactList.add(person);
    }
}
