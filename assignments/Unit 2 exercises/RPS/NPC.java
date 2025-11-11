public class NPC {
    private static String choice;

    public NPC() {

        choice = RPSGame.generateRandomChoice();
    }


    public static String getChoice() {
        return choice;
    }


    public static void setChoice(String newChoice) {

        newChoice = newChoice.toLowerCase();

        
        if (RPSGame.validateChoice(choice)) {
            choice = newChoice;
        } else {
    
            choice = RPSGame.generateRandomChoice();
        }


    }

  
    @Override
    public String toString() {
        return "Opponent chose " + choice + ".";
    }
}
