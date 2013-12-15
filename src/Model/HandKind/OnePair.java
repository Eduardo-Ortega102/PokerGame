package Model.HandKind;

import Model.Card;
import Model.Hand;

public class OnePair implements HandKind {

    @Override
    public boolean check(Hand hand) {
        Card[] cards = hand.getCards();
        for (int index = 0; index < (cards.length - 1); index++) {
            if (cards[index].getRank() == cards[index + 1].getRank()) return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return "One_Pair";
    }
}
