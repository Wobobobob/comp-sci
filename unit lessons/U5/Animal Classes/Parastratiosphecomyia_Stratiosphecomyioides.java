public class Parastratiosphecomyia_Stratiosphecomyioides extends Animal {
    private double size;
    private String country_Located;
    private String species;
    private int hunger;

    public Parastratiosphecomyia_Stratiosphecomyioides(double size) {
        if (size < 10.2 || size > 10.5) {
            throw new IllegalArgumentException(
                    "the Parastratiosphecomyia_Stratiosphecomyioides cannot be smaller than 10.2 mm or bigger than 10.5 mm");
        } else {
            this.size = size;
        }
        this.country_Located = "Thailand";
    }

    public void funFact() {
        System.out.println(
                "did you know that Parastratiosphecomyia_Stratiosphecomyioides make themselves look like wasps to scare off predators");
    }


    public void feed() {
        System.out.println("eating");
        hunger -= 10;
    }

    public String getScientificName() {
        return "Parastratiosphecomyia_Stratiosphecomyioides";
    }

    public String getSpecies() {
        return this.species;
    };

    public void makeNoise() {
        System.out.println("buzz");
    };

    public String toString() {
        return "the size of this Parastratiosphecomyia_Stratiosphecomyioides is: " + this.size
                + "it is located in the country " + this.country_Located;
    }

}
