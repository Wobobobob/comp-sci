public class Beetle extends Animal implements Flyable, Predator {
    public Beetle() {
        super("beetle", "coleoptera", "Curculionidae", "Phyllophaga", "scarab",
                "everything but antarctica");
    }

    @Override
    public String getFact() {
        int factnum = (int) (Math.random() * 5);
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
        System.out.println("pssss pssss");
    }

    @Override
    public void eat() {
        System.out.println("Crunch Chomp");
    }

    @Override
    public void move() {
        System.out.println("buzz buzz");
    }

    public String getSoundDescription() {
        return "Hissing — a few species force air through their spiracles (breathing holes), creating a hiss when disturbed.";
    };

    public String getEatDescription() {
        return "Most beetles have strong mandibles (chewing mouthparts) that work side to side rather than up and down like ours. When they chew through hard materials like wood, bark, seeds, or other insects, there can be faint gnawing or scraping sounds, but it's usually too quiet for human ears to pick up unless you're very close or there are a lot of them.";
    };

    public String getMoveDescription() {
        return "Most beetles have two pairs of wings. The hard outer pair (elytra) lift up and out of the way, while the membranous hind wings do the actual flapping. The elytra can create a lower-pitched drone as they vibrate in the airflow, while the rapidly beating hind wings produce the higher-pitched buzz.";
    };

    public double getFlightSpeed() {
        return 5.6;
    };

    // returns the maximum altitude the animal can reach in meters
    public double getMaxAltitude() {
        return 3;
    };

    // Basic Behaviors - BE CREATIVE

    // prints out how the animal takes off
    public void takeOff() {
        System.out.println(
                "Takeoff: A beetle opens its hard elytra (wing covers) by splitting them apart along its back, almost like opening a tiny briefcase. Then it unfolds the membranous hind wings that are packed underneath — they're actually folded up in a pretty intricate origami-like pattern. Once everything is spread, the hind wings start beating and the beetle lifts off. The whole process takes a fraction of a second in small beetles but can look hilariously clunky in bigger ones. Some species will climb to a high point first and basically throw themselves off the edge to get airborne.");
    };

    // prints out how the animal flies
    public void fly() {
        System.out.println(
                "Flight: The elytra stay mostly lifted and stationary, acting a bit like the fixed wings on an airplane — providing some lift and stability. The hind wings do all the actual flapping, beating anywhere from around 50 to 200+ times per second depending on species and size. The flight itself tends to be wobbly and not super maneuverable compared to something like a fly. They can steer and adjust altitude but it's not graceful. Think of it as a cargo plane versus a fighter jet.");
    };

    // prints out how the animal lands
    public void land() {
        System.out.println(
                "Landing: Mostly they just… stop flying. They reduce wing speed, angle toward a surface, and more or less drop onto it feet-first. It's often a controlled crash more than an elegant touchdown. Once they land, the hind wings fold back up into their compact origami shape and the elytra snap shut over them. Some bigger beetles visibly stumble or skid a bit on landing.");
    };

    public String getPrimaryPrey() {
        return "small insects";
    };

    // returns the typical size of prey in kilograms
    public double getAveragePreyMass() {
        return 0.5 / 1000;
    };

    // Basic Behaviors - BE CREATIVE

    // prints out how the animal stalks its prey
    public void stalkPrey() {
        System.out.println(
                "Stalking: It depends on the species. Ground beetles are active hunters — they patrol the ground at night, using their antennae to sense chemical trails and vibrations. They're essentially running around searching until they bump into something edible. Tiger beetles use their excellent eyesight to spot prey and chase it down in short sprints. Some species are ambush predators, just sitting and waiting. There's not a lot of sophisticated stalking — it's mostly \"wander until you find something\" or \"sit and wait.\"");
    };

    // prints out how the animal attacks its prey
    public void attackPrey() {
        System.out.println(
                "Attack: Usually a direct rush and grab with their mandibles. Tiger beetles sprint at prey and clamp down. Ground beetles just pounce. Diving beetles grab prey underwater with their legs and bite. There's no venom or web-building or anything elaborate — just speed and strong jaws.");
    };

    // prints out how the animal eats its prey
    public void eatPrey() {
        System.out.println(
                "Eating: They chew with those powerful side-closing mandibles, often while holding prey down with their front legs. Some species use extra-oral digestion — they regurgitate digestive enzymes onto the prey to partially dissolve it, then slurp up the liquefied insides. It's messy and slow, not a quick swallow.");
    };
}
