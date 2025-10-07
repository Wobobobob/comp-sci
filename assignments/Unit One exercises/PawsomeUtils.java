public class PawsomeUtils {
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

    public static void checkin(Dog dog, String personName) {
        dog.setStillInFacility(true);
        dog.setOwnerName(personName);
    }
    public static char generateDogChar(int dogID) {
        return (char) ('F' + dogID % 10 + (dogID / 10) % 10 + dogID / 100 % 10);
    }
    public static String generateDogTag(int dogID, char dogChar) {
        return "" + dogID % 10 + (dogID / 10) % 10 + dogID / 100 + dogChar;
    }

    public static int validateDogID(int dogID) {
        if (dogID < 100 || dogID > 999) {
            dogID = (int) (Math.random() * 900) + 100;
        }
        return dogID;
    }

    
}
