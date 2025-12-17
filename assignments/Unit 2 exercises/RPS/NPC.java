public class NPC {
    private static String choice;

    public NPC() {

        choice = RPSGame.generateRandomChoice();
    }


    public static String getChoice() {
        return choice;
    }


    public static void setChoice(String newChoice) {

        if (newChoice == null) {
            choice = RPSGame.generateRandomChoice();
            return;
        }

        newChoice = newChoice.toLowerCase();

       
        if (RPSGame.validateChoice(newChoice)) {
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
