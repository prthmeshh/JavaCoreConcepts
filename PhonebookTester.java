public class PhonebookTester {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();


        // Adding contacts
        phonebook.addContact(new Contact("Harsh", "Dubey", "9621834102"));
        phonebook.addContact(new Contact("Samir", "Sharma", "9450533467"));
        phonebook.addContact(new Contact("Arihant", "Singh", "9450533468"));
        phonebook.addContact(new Contact("HC", "Verma", "7991937778"));
        phonebook.addContact(new Contact("Yashwant", "Kanitkar", "7991767778"));

        // Display all contacts
        System.out.println("All Contacts:");
        phonebook.displayAllContacts();



        // Removing a contact
        Contact contactToRemove = phonebook.findContactByPhone("9621834102");
        if (contactToRemove != null) {
            phonebook.removeContact(contactToRemove);
            System.out.println("\nContact removed.");
        } else {
            System.out.println("\nContact not found.");
        }



        // Find contact by phone number
        String phoneNumberToFind = "9450533467";
        Contact foundContact = phonebook.findContactByPhone(phoneNumberToFind);
        if (foundContact != null) {
            System.out.println("\nContact found:");
            System.out.println(foundContact);
        } else {
            System.out.println("\nContact with phone number " + phoneNumberToFind + " not found.");
        }



        // Display all contacts after removal
        System.out.println("\nAll Contacts after removal:");
        phonebook.displayAllContacts();

    }
}
