package Model.HandKind;

import Model.Card;
import Model.Hand;
import Model.Rank;

public class ThreeOfAKind implements HandKind {

    @Override
    public boolean check(Hand hand) {
        Card[] cards = hand.getCards();
        for (int i = 1; i < 3; i++) {
            int count = 1;
            Rank rank = cards[i - 1].getRank();
            for (int index = i; index < cards.length; index++) {
                if (cards[index].getRank() == rank) count++;
                if (count == 3) return true;
            }
        }
        return false;
    }

    @Override
    public String getName() {
        return "Three_Of_a_Kind";
    }
}
