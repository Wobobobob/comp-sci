public class Player {
    private int health;
    private String name;

    public Player(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public void eat(Food food) {
        System.out.println(name + " ate food.");
        health += 10;
        System.out.println(name + " has " + health + " health");
    }
}
