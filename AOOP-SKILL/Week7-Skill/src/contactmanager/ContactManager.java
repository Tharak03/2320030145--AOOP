package contactmanager;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContactManager {
    // Set ensures unique contacts
    private Set<Contact> contactSet;
    
    // Map for quick access to contact info via name
    private Map<String, String> contactMap;

    public ContactManager() {
        contactSet = new HashSet<>();
        contactMap = new HashMap<>();
    }

    // Add a new contact if it doesn't already exist
    public boolean addContact(Contact contact) {
        if (contactSet.add(contact)) {
            contactMap.put(contact.getName(), contact.getPhoneNumber());
            return true;
        }
        return false; // Contact already exists
    }

    // Get phone number by contact name
    public String getPhoneNumber(String name) {
        return contactMap.get(name);
    }

    // Update phone number by contact name
    public boolean updatePhoneNumber(String name, String newPhoneNumber) {
        if (contactMap.containsKey(name)) {
            // Remove the old contact and add the updated contact
            Contact oldContact = new Contact(name, contactMap.get(name));
            contactSet.remove(oldContact);
            Contact updatedContact = new Contact(name, newPhoneNumber);
            contactSet.add(updatedContact);
            contactMap.put(name, newPhoneNumber);
            return true;
        }
        return false; // Contact not found
    }

    // Remove a contact by name
    public boolean removeContact(String name) {
        if (contactMap.containsKey(name)) {
            Contact contactToRemove = new Contact(name, contactMap.get(name));
            contactSet.remove(contactToRemove);
            contactMap.remove(name);
            return true;
        }
        return false; // Contact not found
    }

    // Get all contacts
    public Set<Contact> getAllContacts() {
        return contactSet;
    }
}
