import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * CardBattleGame — the main game loop (students implement).
 *
 * USEFUL METHODS YOU'LL NEED:
 *
 * Card methods: card.applySelfOnPlay() -> applies shield/bonusDamage from the card's ability
 * card.getAbility().pingDamageOnPlay() -> how much ping damage this ability deals
 * card.getAbility().cyclesOnPlay() -> whether the card cycles to the bottom of the deck
 * card.computeDamageAgainst(defender) -> calculates damage with type multipliers
 * card.takeDamage(amount) -> reduces shield first, then health card.isDefeated() -> true if health
 * <= 0 card.getType() -> returns CardType (uses polymorphism!)
 *
 * PlayerState methods: state.getDeck() -> returns the player's ArrayList<Card> state.getActive() /
 * setActive(card) -> the currently active card (or null) state.hasAnythingLeft() -> true if active
 * card or cards remain in deck state.getPendingDamage() / setPendingDamage(int) -> stored Ripple
 * damage for next drawn card
 */
public class CardBattleGame {

    // To-do: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot

    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        PlayerState player = new PlayerState("Player", playerDeck);
        PlayerState bot = new PlayerState("Bot", botDeck);
        int randomInt = rng.nextInt();
        PlayerState current;
        PlayerState other;
        System.out.println("== CARD CLASH ==");
        if (randomInt % 2 == 0) {
                current = player;
                other = bot;   
            }else{
                current = bot;
                other = player;    
            }
        System.out.println("Starting: " + current.getName());
        while (bot.hasAnythingLeft() && player.hasAnythingLeft()) { 
            
            
            drawAndPlayIfNeeded(current, other);
            attackOnce(current, other);
            PlayerState temp = current;
            current = other;
            other = temp;
        }
        if(bot.hasAnythingLeft()){
            System.out.println("Winner: Bot");
            return "Bot";
        }else{
            System.out.println("Winner: Player");
            return "Player";
        }
       
    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects via card.applySelfOnPlay()
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        ArrayList<Card>mainDeck = self.getDeck();
       
        if(self.getActive() == null && !mainDeck.isEmpty()){
            Card drawn = mainDeck.remove(0);
            
            self.setActive(drawn);
            if (self.getPendingDamage() > 0) {
                drawn.takeDamage(self.getPendingDamage());
                self.setPendingDamage(0);
                
            }
            drawn.applySelfOnPlay();
            if (drawn.getAbility().cyclesOnPlay()) {
                mainDeck.add(drawn);
                self.setActive(null);
                if (other.getActive() != null) {
                    other.getActive().takeDamage(drawn.getAbility().pingDamageOnPlay());

                }else{
                    other.setPendingDamage(1);
                }
                drawAndPlayIfNeeded(self, other);
            }
        }
        


        
        // To-Do: implement the method
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        if (attacker.getActive() == null || defender.getActive() == null) return;
        Card attackingCard = attacker.getActive();
        Card defendingCard = defender.getActive();
        int damageTaken = attackingCard.computeDamageAgainst(defendingCard);
        defendingCard.takeDamage(damageTaken);
        if (defendingCard.isDefeated()) {
            defender.setActive(null);
        }    
        
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DeckValidator.buildDefaultDeck();
        ArrayList<Card> bot = DeckBuilderBot.buildBotDeck();

        if (!DeckValidator.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}
