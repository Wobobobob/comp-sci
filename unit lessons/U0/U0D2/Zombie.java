public class Zombie {
    //attributes ie instance variables
    //green 
    String skincolor = "green";
    //rotten
    //living dead
    boolean isdead = true;

    //behaviors
    //eats brain
    int humanseaten = 0;
    //growl

    public static void main(String[] args) {
        Zombie zombie = new Zombie();
        
        System.out.println(zombie.growl());
        System.out.println("zombie ate "+zombie.humanseaten());
        zombie.eatHuman();
        System.out.println(zombie.humanseaten());
        zombie.feast(14);
        System.out.println(zombie.humanseaten());
        
    }
    public String growl(){
        return "Grrrrrrrrrrrrrrgghhhhhhhh";

    };
    //shamble about
    public int humanseaten(){
        return humanseaten;
    }
    public void eatHuman(){
        humanseaten++;
    }

    public void feast(int humanCount){
        humanseaten += humanCount;
    }
    
}
