// camelCase a way to write variables and its standard in java
// a class is not the object itself but rather a plan
public class Spaceship {
    // instance variables
    private String description;

    private int passengerCount;
    private double fuelLevel;
    private boolean sheildActive;

    // constructor
    public Spaceship(String inputDescription, int inputPassengerCount, double inputFuelLevel,
            boolean inputSheildsActive) {
        description = inputDescription;
        passengerCount = inputPassengerCount;
        fuelLevel = inputFuelLevel;
        sheildActive = inputSheildsActive;
    }

    // methods
    public String getDescription() {
        return description;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean getShieldActive() {
        return sheildActive;
    }

    // setters(methods are void)
    public void setDescription(String input) {
        description = input;
    }

    public void setPassengerCount(int input) {
        passengerCount = input;
    }

    public void setFuelLevel(double input) {
        fuelLevel = input;
    }

    public void setShieldsActive(boolean input) {
        sheildActive = input;
    }

}
