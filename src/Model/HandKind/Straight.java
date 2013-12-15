package Model.HandKind;

import Model.Card;
import Model.Hand;
import Model.Rank;

public class Straight implements HandKind {

    @Override
    public String getName() {
        return "Straight";
    }

    @Override
    public boolean check(Hand hand) {
        Card[] cards = hand.getCards();
        if (cards[0].getRank() == Rank.TWO && cards[cards.length - 1].getRank() == Rank.AS) {
            return isStraight(cards, cards.length - 2);
        }
        return isStraight(cards, cards.length - 1);
    }

    private boolean isStraight(Card[] cards, int limit) {
        for (int index = 0; index < limit; index++) {
            if (!isLessThan(index, index + 1, cards)) return false;
        }
        return true;
    }

    private boolean isLessThan(int actualIndex, int nextIndex, Card[] cards) {
        Integer actual = Rank.getValue(cards[actualIndex].getRank());
        Integer next = Rank.getValue(cards[nextIndex].getRank());

        return (actual == next - 1) ? true : false;
    }
}
