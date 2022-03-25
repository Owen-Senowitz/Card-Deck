import java.sql.Array;
import java.util.*;

public class Deck {
    public Deck()
    {
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i < Card.SuitType.values().length; i++)
        {
            for (int j = 0; j < Card.ValueType.values().length; j++)
            {
                Card card = new Card(Card.SuitType.valueOf(String.valueOf(i)), Card.ValueType.valueOf(String.valueOf(j)));
                deck.add(card);
            }
        }
    }

}
