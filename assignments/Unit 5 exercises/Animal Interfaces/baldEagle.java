public class baldEagle extends Animal implements Predator, Flyable {
    public baldEagle() {
        super("Bald Eagle", "Accipitriformes", "Accipitridae", "Haliaeetus", "leucocephalus",
                "North America");
    }

    @Override
    public String getFact() {
        int factnum = (int) (Math.random() * 5);
        return switch (factnum) {
            case 0 -> "Bald eagles can see fish from over a mile away.";

            case 1 -> "Their wingspan can reach over 2 meters (7 feet).";

            case 2 -> "They mate for life and return to the same nest each year, adding to it until it can weigh over a ton.";

            case 3 -> "They were removed from the U.S. endangered species list in 2007 after a major conservation comeback.";

            case 4 -> "Despite their name they aren't bald — \"bald\" comes from an old English word \"piebald\" meaning white-headed.";

            default -> "";
        };

    }

    @Override
    public String getFact(int factnum) {
        return switch (factnum) {
            case 0 -> "Beetles are the most species rich order of animals on Earth — about 1 in every 4 known animal species is a beetle.";

            case 1 -> "The hercules beetle can carry 850 times its own body weight, making it one of the strongest creatures relative to size.";

            case 2 -> "Fireflies are actually beetles, not flies.";

            case 3 -> "Some bombardier beetles defend themselves by shooting a boiling hot chemical spray from their abdomen at attackers.";

            case 4 -> "The ancient Egyptians considered scarab beetles sacred and used them as symbols of rebirth and protection.";

            default -> "";
        };

    }

    @Override
    public void makeSound() {
        System.out.println("kee-kee-kee-kee");
    }

    @Override
    public void eat() {
        System.out.println("rrrip-tear-rrrip");
    }

    @Override
    public void move() {
        System.out.println("fwoooosh-fwoooosh");
    }

    public String getSoundDescription() {
        return "kee-kee-kee-kee\" — a rapid high-pitched chattering whistle they use to communicate with their mate, defend territory, or signal alarm.";
    };

    public String getEatDescription() {
        return "rrrip-tear-rrrip\" — the sound of their hooked beak shredding flesh and tearing strips of meat off their prey.";
    };

    public String getMoveDescription() {
        return "fwoooosh-fwoooosh\" — the deep heavy rush of air pushed by their massive wings as they flap or dive.";
    };

    public double getFlightSpeed() {
        return 40;
    };

    // returns the maximum altitude the animal can reach in meters
    public double getMaxAltitude() {
        return 4500;
    };

    // Basic Behaviors - BE CREATIVE

    // prints out how the animal takes off
    public void takeOff() {
        System.out.println(
                "They face into the wind, crouch down, and launch with a few powerful wing beats. From a perch like a tree or cliff they often just drop off the edge and let gravity give them momentum before spreading their wings. From the ground it takes more effort — heavy flapping to get airborne, which is why they prefer high perches.");
    };

    // prints out how the animal flies
    public void fly() {
        System.out.println(
                "They're built for soaring. They find rising columns of warm air (thermals) and spiral upward with wings spread flat, barely flapping at all. Once high enough they glide long distances, only flapping occasionally to maintain speed or adjust direction. When hunting they shift into a focused dive, tucking their wings partially to drop fast toward the water.");
    };

    // prints out how the animal lands
    public void land() {
        System.out.println(
                "They spread their wings wide to slow down, fan out their tail as a brake, and swing their talons forward. On a perch they grab on with their feet and fold their wings. On water catches they skim the surface feet-first, snag a fish, and power back up with heavy wingbeats. Landings on the nest are usually gentle and controlled since they're often bringing food to chicks.");
    };

    public String getPrimaryPrey() {
        return "Fish";
    };

    // returns the typical size of prey in kilograms
    public double getAveragePreyMass() {
        return 4;
    };

    // Basic Behaviors - BE CREATIVE

    // prints out how the animal stalks its prey
    public void stalkPrey() {
        System.out.println(
                "They perch high in a tall tree near water and scan the surface with their incredible eyesight. They can spot a fish from over a mile away. Once they lock onto a target near the surface they watch its movement and pick their moment. It's patient and methodical — they wait for the right angle rather than chasing blindly.");
    };

    // prints out how the animal attacks its prey
    public void attackPrey() {
        System.out.println(
                "They launch from the perch or a soaring position and enter a fast shallow dive toward the water. At the last second they swing their legs forward and extend their talons, skimming the water surface and snatching the fish out. Their talons have rough bumpy pads called spicules that grip slippery fish like sandpaper. The whole strike takes a couple of seconds. If they miss they circle back and try again.");
    };

    // prints out how the animal eats its prey
    public void eatPrey() {
        System.out.println(
                "They carry the fish back to a perch or nest, pin it down with one or both feet, and tear it apart with their beak. They rip off strips and swallow them whole — no chewing. Bones, scales, and other indigestible bits get compacted into pellets and coughed up later. A full meal can take 10–20 minutes of steady tearing and swallowing.");
    };
}
