package blackjack;

import java.util.ArrayList;
import java.util.List;



public class BlackJack {
    
    
    public List<Player> getWinners(Player player1,Player player2,
            Player player3, Player croupier, Deck deck){
        
        List<Player> winners = new ArrayList<>();
        
        while(addCardsValue(croupier)< 17){
            croupier.giveCard(deck.takeCard());
        }
        
        
    
        if(checkWinner(player1,croupier)) winners.add(player1);
        if(checkWinner(player2,croupier)) winners.add(player2);
        if(checkWinner(player3,croupier)) winners.add(player3);
        

        return winners;
        
        
    }
    
    public static void main(String[] args) {
        
    }

    private boolean checkWinner(Player player, Player croupier) {
        
        int valueCardsPlayer = addCardsValue(player);
        int valueCardsCroupier = addCardsValue(croupier);
        
        if(valueCardsPlayer > 21) return false;
        if(valueCardsPlayer > valueCardsCroupier) return true;
        if(valueCardsPlayer == 21 && valueCardsCroupier == 21 &&
                player.getHand().size() == 2 && 
                croupier.getHand().size() != 2 ) return true;
        
        if(valueCardsCroupier >= valueCardsPlayer) return false;
        
        return false;
        
    }

    private int addCardsValue(Player player) {
        List<Card> hand = player.getHand();
        int totalValue = 0;
        int amountAce = 0;
        for(Card card : hand){
            totalValue = totalValue + card.getValue();
            if(card instanceof CardAce) amountAce++;
            
        }
        
        while(totalValue > 21 && amountAce>0){
            totalValue = totalValue - 10;
            amountAce--;
        }
        
        return totalValue;
    }
    
}
