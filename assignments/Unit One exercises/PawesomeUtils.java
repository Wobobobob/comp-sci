public class PawesomeUtils {
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
        boolean isValid = PawesomeUtils.validateDogTag(dog);
        if (isValid == true) {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
            System.out.println("Dog checked in successfully.");
        } else {
            System.out.println("Invalid dog tag. Dog cannot be checked in.");
        }

    }

    public static char generateDogChar(int dogId) {
        if (dogId == 694) {
            return 'O';
        }
        return (char) ('F' + dogId % 10 + (dogId / 10) % 10 + dogId / 100 % 10);
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId / 100 + (dogId / 10) % 10 + dogId % 10 + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (dogId < 100 || dogId > 999) {
            dogId = (int) (Math.random() * 900) + 100;
            return dogId;
        } else {
            return dogId;
        }

    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        int validDogId = PawesomeUtils.validateDogId(dogId);
        generateDogChar(validDogId);
        String newDogTag = generateDogTag(validDogId, dog.getDogChar());
        if (dog.getDogTag().equals(newDogTag)) {
            return true;
        } else {
            return false;
        }
    }

    public static int convertAgeToHumanYears(int dogAge) {
        if (dogAge <= 0) {
            return 0;
        } else if (dogAge == 1) {
            return 15;
        } else if (dogAge == 2) {
            return 24;
        } else {
            return 24 + (dogAge - 2) * 5;
        }
    }

    public static int convertHumanYearsToDogYears(int humanAge) {
        if (humanAge <= 0) {
            return 0;
        } else if (humanAge == 1) {
            return 1;
        } else if (humanAge <= 24) {
            return 2;
        } else {
            return 2 + (humanAge - 24) / 5;
        }
    }


}
