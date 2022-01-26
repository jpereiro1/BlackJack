package tests;

import blackjack.BlackJack;
import org.junit.*;


public class BlackJackTests {
    
    BlackJack bj;
   
    @Before
    public void setUp() {
        bj = new BlackJack();
    }
    
    @Test
    public void testCase1(){
        String[] cardsPlayer1= {"J","A"};
        String[] cardsPlayer2= {"10","5","6"};
        String[] cardsPlayer3= {"3","6","A","3","A","K"};
        String[] cardsCroupier= {"9","7"};
        String[] deck = {"5","4","K","2"};
        
        String[] result = {""};
        
        Assert.assertArrayEquals(result, bj.getWinners(cardsPlayer1, cardsPlayer2,
                cardsPlayer3, cardsCroupier, deck));
    }
    


}
