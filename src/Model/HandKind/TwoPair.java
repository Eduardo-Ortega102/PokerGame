package Model.HandKind;

import Model.Card;
import Model.Hand;

public class TwoPair implements HandKind {

    @Override
    public boolean check(Hand hand) {
        Card[] cards = hand.getCards();
        int count = 0;
        for (int index = 0; index < (cards.length - 1); index++) {
            if (cards[index].getRank() == cards[index + 1].getRank()) count++;
            if (count == 2) return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "TwoPairs";
    }
}
