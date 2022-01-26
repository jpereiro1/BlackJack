
package blackjack;

public class CardNumber implements Card {
    
    private final Integer number;

    public CardNumber(Integer number) {
        this.number = number;
    }
    
    @Override
    public Integer getValue() {
        return number;
    }
    
}
