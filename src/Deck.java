
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
    public void shuffle()
    {
        Random ranNum = new Random();
        int n = Deck.newDeck().size();
        while (n > 1)
        {
            n--;
            int k = ranNum.nextInt(n + 1);
            Card value = Deck.newDeck().get(k);
            Deck.newDeck().set(k, Deck.newDeck().get(n));
            Deck.newDeck().set(n, value);
        }
    }
}