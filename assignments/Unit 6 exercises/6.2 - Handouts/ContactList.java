import java.util.AbstractList;
import java.util.ArrayList;

public class ContactList extends AbstractList {
    
    // instance variable
    private ArrayList<String> contactList;

    // constructor
    // to-do: initializes an empty contact list
    public ContactList() {
        contactList = new ArrayList<String>();
    }

    // methods

    // to-do: findInsertLocation(String name)
    /**
     * returns the location in the contact list where the name should go to keep the list
     * alphabetized
     */
    private int findInsertLocation(String name) {
        for (int i = 0; i <= contactList.size() - 1; i++) {
            String other = contactList.get(i);
            int x = name.compareTo(other);

            if (x == 0) {
                return i;
            }
            if (x < 0) {
                return i;
            }
        }
        // You can use a sequential search here. But for a Stretch Challenge, try to do
        // a binary search.
        return contactList.size();
    }

    // to-do: add(String name)
    /**
     * adds a name to the contact list so that the list remains alphabetized, it prints out which
     * name is being added, also the method prevents duplicate names from being added
     */
    public boolean add(String name) {
        if (name == null) {
            throw new IllegalArgumentException("cannot have a null name");
        }
        if (name.equals("")) {
            throw new IllegalArgumentException("cannot have an empty name");
        }
        System.out.println("+ Adding " + name);
        for (int i = 0; i < contactList.size(); i++) {
            if (name.equals(contactList.get(i))) {
                return false;
            }
        }
        int i = findInsertLocation(name);
        contactList.add(i, name);
        return true;
    }

    // to-do: add(ArrayList<String> names)
    /* this method adds a list of names to the contact list */
    public void add(ArrayList<String> names) {
        if (names == null) {
            throw new IllegalArgumentException("cannot have a null name");
        }
        for (String name : names) {
            add(name);
        }
    }

    // to-do: remove(String name)
    /** removes name from the contact list and keeps list alphabetized */
    public boolean remove(String name) {
        if (name == null) {
            throw new IllegalArgumentException("cannot have a null name");
        }
        if (name.equals("")) {
            throw new IllegalArgumentException("cannot have an empty name");
        }
        for (int i = 0; i < contactList.size(); i++) {
            if (name.equals(contactList.get(i))) {
                contactList.remove(i);
                return true;
            }
        }
        return false;
    }

    // to-do: remove(ArrayList<String> names)
    /* this method removes a list of names from the contact list */
    public void remove(ArrayList<String> names) {
        for (String name : names) {
            contactList.remove(name);
        }
    }

    /** returns a String containing all of the words in list */
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    // to-do: get(int index)
    /** returns the name at the specified index */
    public String get(int index) {
        String name = contactList.get(index);
        return name;
    }

    // to-do: size()
    /** returns the number of names in the contact list */
    public int size() {
        int a = 0;
        for (String name : contactList) {
            a++;
        }
        return a;
    }

    // to-do: clear()
    /** removes all names from the contact list */
    public void clear() {
        contactList.clear();
        System.out.println("Clearing the contact list");
    }

}
