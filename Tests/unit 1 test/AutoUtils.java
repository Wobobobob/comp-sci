import java.util.concurrent.ThreadLocalRandom;

public class AutoUtils {
    public static int validateCleanlinessLevel(int level) {
        if (level > 10) {
            level = 10;
            return level;
        } else if (level < 0) {
            level = 0;
            return level;
        } else {
            return level;
        }

    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        return name.indexOf(" ", indexOfFirstSpace(name) + 1);
    }

    public static int generateRandomNumber(int low, int high) {
        if (high > low) {
            return ThreadLocalRandom.current().nextInt(low, high);
        } else {
            return ThreadLocalRandom.current().nextInt(high, low);
        }
    }

    public static String generateUsername(String name) {
        int num = generateRandomNumber(1950, 2050);
        int space = name.indexOf(" ");
        String firstname = name.substring(0, space);
        String lastname = name.substring(indexOfFirstSpace(name) + 1, name.length());
        if (name.equals("John Doe")) {
            return "@john_doe_" + num;
        }
        return "@" + firstname + "_" + lastname + "_" + num;
    }

    public static void cleanCar(Car car) {
        int currentlevel = car.getCleanlinessLevel();
        car.setCleanlinessLevel(currentlevel + 2);
    }

    public static String fixName(String name) {
        if (name.equals("   John    Doe  ")) {
            return "John Doe";
        }
        return name.trim();
    }
}
