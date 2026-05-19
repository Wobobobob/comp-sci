
import java.util.ArrayList;

public class panthera_Leo extends Animal {
    private boolean isMale;
    private boolean inZoo;
    private String country_Located;
    private ArrayList<panthera_Leo> pride;
    private int age;
    private int maleCount;
    private String species;


    public panthera_Leo(boolean isMale, boolean inZoo, String country, int age) {
        this.isMale = isMale;
        this.inZoo = inZoo;
        this.country_Located = country_Located;
        this.age = age;
    }

    public void addToPride(panthera_Leo leo) {
        if (age > 3 && isMale) {
            if (this.maleCount <= 4) {
                maleCount++;
                this.pride.add(leo);
            } else {
                throw new IllegalArgumentException(
                        "can't have more than 4 male adult lions in a pride find a new one");
            }
        } else {
            this.pride.add(leo);
        }
    }

    public void feed() {
        System.out.println("eating");
        hunger -= 10;
    }

    public String getScientificName() {
        return "panthera_Leo";
    }

    public String getSpecies() {
        return this.species;
    };

    public void makeNoise() {
        System.out.println("buzz");
    };

    public void funFact() {
        System.out.println(
                "did you know that lions roar to another pride and listen to the number of individual voices int the responsize roar and if there are less voices than them they will charge");
    }

    public String toString() {
        return "this panthera leo is " + this.age + "years old and is located in "
                + this.country_Located;
    }
}
