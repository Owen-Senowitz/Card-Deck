
import java.util.ArrayList;
import java.util.List;

public class Deck extends Card {

    private static List<Card> protoDeck = new ArrayList<Card>();

    static {
        for (final Suit suit : Suit.values()) {
            for (final Rank rank : Rank.values()) {
                Card tempCard = new Card(rank, suit);
                Deck.protoDeck.add(tempCard);
            }
        }
    }

    protected Deck(final Rank rank, final Suit suit) {
        super(rank, suit);
    }

    public static ArrayList<Card> newDeck() {
        return new ArrayList<Card>(Deck.protoDeck);
    }
}