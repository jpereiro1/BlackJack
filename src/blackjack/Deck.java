
package blackjack;

import java.util.List;


public class Deck {
    private final List<Card> deck;

    public Deck(List <Card> deck ) {
        this.deck = deck;
    }

    public List<Card> getDeck() {
        return deck;
    }
    
    public Card takeCard(){
        return deck.remove(0);
    }
    
    
}
