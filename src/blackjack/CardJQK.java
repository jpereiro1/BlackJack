
package blackjack;


public class CardJQK implements Card{
    
    private final char letter;

    public CardJQK(char letter) {
        this.letter = letter;
    }
    
    @Override
    public Integer getValue() {
        return 10;
    }
    
}
