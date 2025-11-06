
import java.util.concurrent.ThreadLocalRandom;



public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        int mood = cat.getMoodLevel();
        String name = cat.getName();
        if (mood > 7) {
            return "Currently, " + name + " is in a great mood.\n" + "Petting is appreciated.";
        } else if (mood >= 3) {
            return "Currently, " + name + "is reminiscing of a past life.\n"
                    + " Petting is acceptable.";
        } else {
            return "Currently, " + name + "is plotting revengeance.\n"
                    + "Petting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        if (catId == null) {
            return 'A';
        }
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            char c = catId.charAt(i);
            if (Character.isDigit(c)) {
                sum += (c - '0');
            }
        }
        return (char) ('A' + (sum % 26));
    }

    public static int generateRandomNumber(int low, int high) {
        if (high > low) {
            return ThreadLocalRandom.current().nextInt(low, high + 1);
        } else {
            return ThreadLocalRandom.current().nextInt(high, low + 1);
        }
    }

    public static String validateCatId(String catId) {
        int intid = Integer.parseInt(catId);
        if (intid <= 9999 && intid >= 1000) {
            return catId;
        } else {
            return generateRandomNumber(1000, 9999) + "";
        }
    }

    public static int validateMoodLevel(int mood) {
        if (mood > 10) {
            mood = 10;
            return mood;
        } else if (mood < 0) {
            mood = 0;
            return mood;
        } else {
            return mood;
        }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        } else if (cat.isHungry() == false) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        } else {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println("Petting failed...");
        }

    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int randomnum = generateRandomNumber(1, 2);
        cat.setMoodLevel(cat.getMoodLevel() - randomnum);
        if (randomnum == 1) {
            System.out.println("Cookie did not like that...");
        } else {
            System.out.println("Cookie really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out
                .println("Cleaning the litter box...\n" + "Done! \n" + "Cookie appreciated that.");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Filling up Cookie's bowl...\n" + "Done!\n" + "Cookie is eating...\n"
                + "Cookie is full!");
    }



}
