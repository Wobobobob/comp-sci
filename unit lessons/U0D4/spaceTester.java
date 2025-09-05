public class spaceTester {
    public static void main(String[] args) {
        // instantiate a spaceship
        Spaceship blackpearl = new Spaceship("red", 30, 90.0, true);
        // creates new object

        // invoke a method
        blackpearl.setShieldsActive(true);
        blackpearl.setPassengerCount(33);
        blackpearl.setFuelLevel(5.3);
        String blackpearlDescription = blackpearl.getDescription();

        int blackpearlPassengerCount = blackpearl.getPassengerCount();

        System.out.println(blackpearlDescription);
        System.out.println(blackpearlPassengerCount);

        // manipulate the data

    }
}
