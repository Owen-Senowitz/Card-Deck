import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

        ArrayList<Card> d = Deck.newDeck();
        Collections.sort(d);
        for(Card c : d){
            System.out.println(c);
        }
    }

}