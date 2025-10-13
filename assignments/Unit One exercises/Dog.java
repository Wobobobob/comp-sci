public class Dog {
    private String name;
    private int age;
    private String ownerName;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
        this.dogId = dogId;
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.stillInFacility = stillInFacility;
        stillInFacility = true;

    }

    Dog() {
        name = "Doggo";
        age = 1;
        ownerName = "Jane Doe";
        dogId = 999;
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

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
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
        System.out.println(dogTag);
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
                + dogId + ", dog character=" + dogChar + ", dogTag=" + dogTag
                + ", Still In Facilit?y=" + stillInFacility;
    }

    public boolean equals(Dog other) {
        if (this.dogId == other.dogId && this.name.equals(other.name) && this.age == other.age
                && this.ownerName.equals(other.ownerName)) {
            return true;
        } else {
            return false;
        }
    }



}
