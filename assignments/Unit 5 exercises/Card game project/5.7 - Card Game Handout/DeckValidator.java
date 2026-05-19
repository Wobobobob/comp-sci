import java.util.ArrayList;
import java.util.Scanner;

/*
 * DeckValidator — deck validation and building (students implement).
 *
 * USEFUL METHODS FOR YOUR IMPLEMENTATIONS:
 *
 * card.hasAbility() -> true if the card has a real ability (not NONE) card.getAbility() -> returns
 * the Ability interface reference card.getAbility().getId() -> returns "BASTION", "RIPPLE",
 * "CLEAVE", or "NONE" card.getType() -> returns the CardType enum (GRANITE, PARCHMENT, BLADE)
 * card.getStrength() -> returns the card's strength stat card.getHealth() -> returns the card's
 * health stat
 *
 * CardType.fromText("granite") -> returns CardType.GRANITE AbilityLibrary.fromText("bastion") ->
 * returns the BastionAbility instance
 *
 * createCard("name", type, str, hp, ability) -> creates the right subclass (Granite, Parchment, or
 * Blade) based on the CardType
 */
public class DeckValidator {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no more than 3 total ability cards in the deck.
    // HINT: loop through the deck, use card.hasAbility() to count how many
    // cards have a real ability, and return true if the count is <= 3.
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        int cardsWithAbilities = 0;

        for (Card card : deck) {
            if (card.hasAbility()) {
                cardsWithAbilities++;
            }
        }
        // To-Do: implement the method
        return cardsWithAbilities <= 3;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one
    // CLEAVE).
    // HINT: loop through the deck, use card.getAbility().getId() to get
    // each ability's name, and check for duplicates.
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        for (Card card : deck) {
            for (Card card2 : deck) {
                if (card.equals(card2)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Rule: strength and health must be 1..5, and strength + health <= 6.
    // HINT: loop through the deck, use card.getStrength() and card.getHealth().
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        // To-Do: implement the method
        for (Card card : deck) {
            if (card.getHealth() + card.getStrength() > 6) {
                return false;
            }
        }
        return true;
    }

    // Returns true only if the deck is fully valid:
    // - deck has exactly 5 cards
    // - AND all checks above return true
    public static boolean isValidDeck(ArrayList<Card> deck) {
        int cardCount = 0;
        // To-Do: implement the method

        for (Card card : deck){
            cardCount ++;
            
        }
        return cardCount == 5;
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities (use AbilityLibrary.NONE).
    // Use the Granite, Parchment, and Blade subclasses directly,
    // or use the createCard() helper below.
    public static ArrayList<Card> buildDefaultDeck() {
        createCard("card1", CardType.GRANITE, 3, 3, AbilityLibrary.NONE);
        createCard("card2", CardType.PARCHMENT, 3, 3, AbilityLibrary.NONE);
        createCard("card3", CardType.BLADE, 3, 3, AbilityLibrary.NONE);
        createCard("card4", CardType.GRANITE, 3, 3, AbilityLibrary.NONE);
        createCard("card5", CardType.PARCHMENT, 3, 3, AbilityLibrary.NONE);
        
        return null;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // 1. name (String)
    // 2. type (granite / parchment / blade) -> use CardType.fromText()
    // 3. strength (int)
    // 4. health (int)
    // 5. ability (bastion / ripple / cleave / none) -> use
    // AbilityLibrary.fromText()
    //
    // Then use createCard() to build the right subclass from the parsed type.
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        ArrayList<Card> deck = new ArrayList<>();
        // To-Do: implement the method
        for (int i = 0; i < 5; i++){
            String name;
            String tempString;
            CardType cardType;
            int strength;
            int health;
            Ability abilityType;
            System.out.println("enter card name:");
            name = sc.nextLine();
            System.out.println("enter card type:");
            cardType = CardType.fromText(sc.nextLine());
            System.out.println("enter card strength:");
            strength = Integer.parseInt(sc.nextLine());
            System.out.println("enter card health:");
            health = Integer.parseInt(sc.nextLine());
            System.out.println("enter ability type:");
            abilityType = AbilityLibrary.fromText(sc.nextLine());
            if (health + strength <= 6) {
                Card card = createCard(name, cardType, strength, health, abilityType);
                deck.add(card);
            }else{
                System.out.println("card invalid strength and health cannot be greater than 6 please create a new card");
                i--;
            }
        }
        
        return deck;
    }

    // ----------------------------
    // Helper: create a Card subclass from a CardType
    // ----------------------------

    // This is a FACTORY METHOD — it decides which subclass to instantiate
    // based on the CardType enum value. The caller doesn't need to know
    // about the specific subclasses; they just pass in the type and get
    // back a Card reference.
    public static Card createCard(String name, CardType type, int strength, int health,
            Ability ability) {
        switch (type) {
            case GRANITE:
                return new CardGranite(name, strength, health, ability);
            case PARCHMENT:
                return new CardParchment(name, strength, health, ability);
            case BLADE:
                return new CardBlade(name, strength, health, ability);
            default:
                return null;
        }
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null)
            return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}
