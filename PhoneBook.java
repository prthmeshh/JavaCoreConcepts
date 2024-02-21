import java.util.ArrayList;
import java.util.List;

class Phonebook {
    private List<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public Contact findContactByPhone(String phoneNo) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNo().equals(phoneNo)) {
                return contact;
            }
        }
        return null; // If contact not found
    }

    public void displayAllContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
