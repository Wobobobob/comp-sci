

public class RPSGame {
    private Player player;
    private NPC npc;
    public RPSGame(Player player, NPC opponent){
        this.player = player;
        this.npc = npc;
    }   
    public static String generateRandomChoice(){
        int value = (int)(Math.random() * 3); 
        if (value == 0){
            return "paper";
        }else if(value == 1){
            return "rock";
        }else{
            return "scissors";
        }
    }
}
