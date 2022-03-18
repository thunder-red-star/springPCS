
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Deck deck1 = new Deck({"Ukraine", "Belarus", "Russia"}, {"Tanks", "Battleships", "Aircraft"}, {5, 3, 100});
        deck1.shuffle();
        System.out.println(deck1);
        System.out.println(deck1.deal());
        System.out.println(deck1.deal());
        System.out.println(deck1.deal());

        Deck deck2 = new Deck({"America", "USA", "United States"}, {"Cheeseburgers", "Chicken Nuggets", "French Fries"}, {8, 2, 5});
        deck2.shuffle();
        System.out.println(deck2);
        System.out.println(deck2.deal());
        System.out.println(deck2.deal());
        System.out.println(deck2.deal());

        // [sic]
        Deck deck3 = new Deck({"China", "Taiwan", "Japan"}, {"Buddhists", "Hinduists", "Christians"}, {4, 5, 3});
        deck3.shuffle();
        System.out.println(deck3);
        System.out.println(deck3.deal());
        System.out.println(deck3.deal());
        System.out.println(deck3.deal());
    }
}