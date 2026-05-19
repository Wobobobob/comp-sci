public class Contact implements Comparable {
    private String firstName;
    private String lastName;
    private String telephoneNumber;

    public Contact(String firstName, String lastName, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the telephoneNumber
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * @param telephoneNumber the telephoneNumber to set
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int compareTo(Object other) {
        Contact otherContact = (Contact) other;
        int name1 = this.firstName.compareTo(otherContact.firstName);
        if (name1 != 0) {
            return name1;
        }
        int name2 = this.lastName.compareTo(otherContact.lastName);
        if (name2 != 0) {
            return name2;
        }
        int phoneNum = this.telephoneNumber.compareTo(otherContact.telephoneNumber);
        return phoneNum;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.telephoneNumber;
    }


}
