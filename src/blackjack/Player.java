
package blackjack;

import java.util.List;


public class Player {
    private final String name;
    private final List<Card> hand;

    public Player(String name, List<Card> hand) {
        this.name = name;
        this.hand = hand;
    }

    public List<Card> getHand() {
        return hand;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public void giveCard(Card card){
        hand.add(card);
    }

    @Override
    public boolean equals(Object obj) {
        Player pl = (Player) obj;
        if(this.name.equals(pl.toString())){
            return true;
        }else{
            return false;
        }
    }
    
    

}
