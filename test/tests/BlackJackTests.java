package tests;

import blackjack.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;


public class BlackJackTests {
    
    BlackJack bj;
     
    
    @Before
    public void setUp() {
        bj = new BlackJack();
    }
    
    @Test
    public void testCase1(){
        
        Player player1 = dealCardsPlayers("Player1", "J,A");
        Player player2 = dealCardsPlayers("Player2", "10,5,6");
        Player player3 = dealCardsPlayers("Player3", "3,6,A,3,A,K");
        Player croupier = dealCardsPlayers("Croupier", "9,7");
        Deck deck = dealCardsDeck("5,4,K,2");
        
        List<Player> result = new ArrayList<>();
        result.add(player1);
        
        List<Player> winners = bj.getWinners(player1, player2, player3, croupier, deck);
        
        Assert.assertEquals(result.toString(), winners.toString());
           
    }
    
    @Test
    public void testCase2() {
        
        Player player1 = dealCardsPlayers("Player1", "10,K");
        Player player2 = dealCardsPlayers("Player2", "10,2,6");
        Player player3 = dealCardsPlayers("Player3", "8,8,5");
        Player croupier = dealCardsPlayers("Croupier", "5,10");
        Deck deck = dealCardsDeck("A,3,K,2");
        
        List<Player> result = new ArrayList<>();
        result.add(player1);
        result.add(player3);
        
        List<Player> winners = bj.getWinners(player1, player2, player3, croupier, deck);
        
        Assert.assertEquals(result.toString(), winners.toString());
    }
    
    
    public Player dealCardsPlayers(String name,String cards){
        String[] split = cards.split(",");
        ArrayList<Card> deck = new ArrayList<>();
        for (String string : split) {
            switch(string){
                case "1":
                case "2":    
                case "3":    
                case "4":    
                case "5":    
                case "6":    
                case "7":    
                case "8":    
                case "9":    
                case "10":
                    deck.add(new CardNumber(Integer.parseInt(string)));
                    break;
                case "J":
                case "Q":
                case "K":
                    deck.add(new CardJQK(string.charAt(0)));
                    break;
                case "A":
                    deck.add(new CardAce());
                    break;
            }
        }

        Player player = new Player(name,deck);
        
        return player;
    }
    
    public Deck dealCardsDeck(String cards){
        String[] split = cards.split(",");
        ArrayList<Card> deck = new ArrayList<Card>();
        for (String string : split) {
            switch(string){
                case "1":
                case "2":    
                case "3":    
                case "4":    
                case "5":    
                case "6":    
                case "7":    
                case "8":    
                case "9":    
                case "10":
                    deck.add(new CardNumber(Integer.parseInt(string)));
                    break;
                case "J":
                case "Q":
                case "K":
                    deck.add(new CardJQK(string.charAt(0)));
                    break;
                case "A":
                    deck.add(new CardAce());
                    break;
            }
        }

        Deck deckCards = new Deck(deck);
        
        return deckCards;
    }
    


}
