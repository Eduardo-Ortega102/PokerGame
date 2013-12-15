package Model.HandKind;

import Model.Card;
import Model.Hand;
import Model.Suit;

public class Flush implements HandKind {

    @Override
    public boolean check(Hand hand) {
        Card[] cards = hand.getCards();
        Suit suit = cards[0].getSuit();
        for (int index = 0; index < cards.length; index++) {
            if(cards[index].getSuit() != suit) return false;
        }
        return true;
    }

    @Override
    public String getName() {
        return "Flush";
    }

}
