import java.util.AbstractList;
import java.util.ArrayList;

public class ContactList extends AbstractList<Contact> {


    private ArrayList<Contact> contactList;



    public ContactList() {
        this.contactList = new ArrayList<Contact>();
    }

    public int size() {
        return contactList.size();
    }

    public Contact get(int i) {
        return contactList.get(i);
    }


    public boolean add(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("cannot have a null name");
        }
        System.out.println("+ Adding " + contact.getFirstName());
        for (int i = 0; i < contactList.size(); i++) {
            if (contact.getTelephoneNumber().equals(contactList.get(i).getTelephoneNumber())) {
                return false;
            }
        }
        contactList.add(contact);
        return true;
    }

    public boolean remove(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("cannot have a null name");
        }

        for (int i = 0; i < contactList.size(); i++) {
            if (contact.equals(contactList.get(i))) {
                contactList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void sortByFirstName() {
        for (int i = 1; i < contactList.size(); i++) {
            int b = i;
            while (b > 0) {
                int a = contactList.get(b).getFirstName()
                        .compareTo(contactList.get(b - 1).getFirstName());
                if (a == 0) {
                    a = contactList.get(b).compareTo(contactList.get(b - 1));
                }

                if (a < 0) {
                    Contact savedContact = contactList.get(b - 1);
                    contactList.set(b - 1, contactList.get(b));
                    contactList.set(b, savedContact);
                }
                b--;
            }


        }
    }

    public void sortByLastName() {
        for (int i = 1; i < contactList.size(); i++) {
            int b = i;
            while (b > 0) {
                int a = contactList.get(b).getLastName()
                        .compareTo(contactList.get(b - 1).getLastName());
                if (a == 0) {
                    a = contactList.get(b).compareTo(contactList.get(b - 1));
                }

                if (a < 0) {
                    Contact savedContact = contactList.get(b - 1);
                    contactList.set(b - 1, contactList.get(b));
                    contactList.set(b, savedContact);
                }
                b--;
            }


        }
    }

    public void sortByTelephoneNumber() {

        for (int i = 0; i < contactList.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < contactList.size(); j++) {
                if (contactList.get(j).getTelephoneNumber()
                        .compareTo(contactList.get(minIndex).getTelephoneNumber()) < 0) {
                    minIndex = j;
                }
            }
            Contact tempContact = contactList.get(i);
            contactList.set(i, contactList.get(minIndex));
            contactList.set(minIndex, tempContact);
        }
    }



    public String toString() {
        String contactListString = "";
        for (Contact contact : contactList) {
            contactListString += contact.toString();
        }
        return "Contact List: " + contactListString;
    }


    public Contact searchContacts(String telephoneNum) {
        for (Contact contact : contactList) {
            if (contact.getTelephoneNumber().equals(telephoneNum)) {
                return contact;
            }
        }
        return null;
    }
}
