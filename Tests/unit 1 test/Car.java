public class Car {
    private String model;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsOilChange;

    public Car() {
        this.model = "Honda Civic Type R";
        this.ownerName = "Wobobobob Coolbob";
        this.cleanlinessLevel = 6;
        this.needsOilChange = false;
        this.username = AutoUtils.generateUsername("Wobobobob Coolbob");
    }

    public Car(String model, String ownerName, int cleanlinesLevel) {
        this.model = model;
        String fixedName = AutoUtils.fixName(ownerName);
        this.ownerName = fixedName;
        int validLevel = AutoUtils.validateCleanlinessLevel(cleanlinesLevel);
        this.cleanlinessLevel = validLevel;
        this.username = AutoUtils.generateUsername(fixedName);
        this.needsOilChange = false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        String fixedName = AutoUtils.fixName(ownerName);
        this.ownerName = ownerName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinesLevel) {
        int validLevel = AutoUtils.validateCleanlinessLevel(cleanlinesLevel);
        this.cleanlinessLevel = validLevel;
    }

    public boolean isNeedsOilChange() {
        return needsOilChange;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

    public String toString(Car car) {
        return "==ABOUT CAR==\n Model: " + car.getModel() + "\nOwner: " + car.getOwnerName()
                + "\nUsername: " + car.getUsername() + "\nCleanliness Level: "
                + car.getCleanlinessLevel() + "\nDoes car need oil change? "
                + car.isNeedsOilChange();
    }

    public boolean equals(Car other) {
        if (this.ownerName.equals(other.getOwnerName())
                && this.needsOilChange == other.isNeedsOilChange()
                && this.model.equals(other.getModel()) && this.username.equals(other.getUsername())
                && this.cleanlinessLevel == other.getCleanlinessLevel()) {
            return true;
        } else {
            return false;
        }
    }
}
