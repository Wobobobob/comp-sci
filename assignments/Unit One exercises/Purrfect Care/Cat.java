

public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    public Cat() {
        this.name = "Kitty";
        this.ownerName = "Bob";
        this.moodLevel = 8;
        String rawId = PurrfectUtils.generateRandomNumber(1000, 9999) + "";
        this.catId = PurrfectUtils.validateCatId(rawId);
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
        this.isHungry = true;
    }

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = name;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.isHungry = true;
        this.catChar = PurrfectUtils.generateCatChar(catId);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", ownerName=" + ownerName + ", moodLevel=" + moodLevel
                + ", catId=" + catId + ", catChar=" + catChar + ", isHungry=" + isHungry + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return "Alice";
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodlevel) {
        int validmood = PurrfectUtils.validateMoodLevel(moodlevel);
        this.moodLevel = validmood;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }
}
