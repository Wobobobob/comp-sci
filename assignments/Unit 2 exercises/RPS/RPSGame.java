import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC npc;
    public RPSGame(Player player, NPC opponent){
        this.player = player;
        this.npc = npc;
    }   

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String choice = scanner.nextLine().toLowerCase();

        int attempts = 1;
        
        while (!validateChoice(choice) && attempts < 3) {
            System.out.println("Invalid choice. Try again:");
            choice = scanner.nextLine().toLowerCase();
            attempts++;
        }
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

    public static boolean validateChoice(String choice) {
    
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

}
