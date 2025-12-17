import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC npc;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.npc = opponent;
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
       
        setPlayerValues(name, choice);
    
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public static String generateRandomChoice() {
        int value = (int) (Math.random() * 3);
        if (value == 0) {
            return "paper";
        } else if (value == 1) {
            return "rock";
        } else {
            return "scissors";
        }
    }

    public static boolean validateChoice(String choice) {

        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    public boolean didPlayerWin() {
        String p = player.getChoice();
        String o = npc.getChoice();


        if (p.equals("rock") && o.equals("scissors"))
            return true;


        if (p.equals("paper") && o.equals("rock"))
            return true;


        if (p.equals("scissors") && o.equals("paper"))
            return true;


        return false;
    }

    @Override
    public String toString() {
        String p = player.getChoice();
        String o = npc.getChoice();


        if (didPlayerWin()) {
            return player.getName() + " won!\nCongratulations!";
        } else {
            return "Opponent won!\nBetter luck next time!";
        }
    }

    public String displayResults() {
        return "== GAME RESULTS ==\n" + player.getName() + " chose " + player.getChoice() + ".\n"
                + "Opponent chose " + npc.getChoice() + ".\n" + this.toString();
    }



}
