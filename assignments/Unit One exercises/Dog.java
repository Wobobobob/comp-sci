public class Dog {
    private String name;
    private int age;
    private String ownerName;
    private int dogID;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    Dog(String name, int age, String ownerName, int dogID) {
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
        this.dogID = dogID;
        this.dogChar = generateDogChar(this.dogID);
        this.dogTag = dogTag;
        this.stillInFacility = stillInFacility;
        stillInFacility = true;


    }

    Dog() {
        name = "Doggo";
        age = 1;
        ownerName = "Jane Doe";
        dogID = 999;
        dogChar = 'C';
        dogTag = "+++";
        stillInFacility = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getDogID() {
        return dogID;
    }

    public void setDogID(int dogID) {
        this.dogID = dogID;
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    @Override
    public String toString() {
        return "Dog name=" + name + ", age=" + age + ", owner name=" + ownerName + ", dogID="
                + dogID + ", dog character=" + dogChar + ", dogTag=" + dogTag
                + ", Still In Facilit?y=" + stillInFacility;
    }

    public boolean equals(Dog other) {
        if (this.dogID == other.dogID && this.name.equals(other.name) && this.age == other.age
                && this.ownerName.equals(other.ownerName)) {
            return true;
        } else {
            return false;
        }
    }

    public static char generateDogChar(int dogID) {
        return (char) ('F' + dogID % 10 + (dogID / 10) % 10 + dogID / 100 % 10);
    }



    public String generateDogTag() {
        return "" + this.dogID % 10 + (this.dogID / 10) % 10 + this.dogID / 100 + this.dogChar;
    }

    public static String pickup(Dog dog, String ownerName) {
        if (dog.isStillInFacility() && dog.getOwnerName().equals(ownerName)) {
            dog.setStillInFacility(false);
            return "Dog picked up successfully.";
        } else if (!dog.isStillInFacility()) {
            return "Dog has already been picked up.";
        } else {
            return "Owner name does not match. Dog cannot be picked up.";
        }
    }

    public  static void checkin(Dog dog, String personName) {
        dog.setStillInFacility(true);
        dog.ownerName = personName;
    }



}
