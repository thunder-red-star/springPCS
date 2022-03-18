/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Card card = new Card("Ace", "Spades", 1);
        System.out.println(card);
        System.out.println("Rank is " + card.getRank());
        System.out.println("Suit is " + card.getSuit());
        System.out.println("Point value is " + card.pointValue());

        Card card2 = new Card("Jack", "Diamonds", 12);
        System.out.println(card2);
        System.out.println("Rank is " + card2.getRank());
        System.out.println("Suit is " + card2.getSuit());
        System.out.println("Point value is " + card2.pointValue());

        Card card3 = new Card("Queen", "Hearts", 92);
        System.out.println(card3);
        System.out.println("Rank is " + card3.getRank());
        System.out.println("Suit is " + card3.getSuit());
        System.out.println("Point value is " + card3.pointValue());

    }
}