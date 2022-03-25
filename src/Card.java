import org.apache.groovy.json.internal.Value;

public class Card {
    public enum SuitType
    {
        Hearts,
        Clubs,
        Diamonds,
        Spades
    }
    public enum ValueType
    {
        Ace,
        Two,
        Three,
        Four,
        Five,
        Six,
        Seven,
        Eight,
        Nine,
        Ten,
        Jack,
        Queen,
        King
    }
    public SuitType Suit;
    public ValueType Value;
    public Card (SuitType suit, ValueType value)
    {
        Suit = suit;
        Value = value;
    }
    @Override
    public String toString()
    {
        return this.Value + " of " + this.Suit;
    }
}
