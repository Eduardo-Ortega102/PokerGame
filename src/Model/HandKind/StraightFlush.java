package Model.HandKind;

import Model.Card;
import Model.Hand;
import Model.Rank;
import Model.Suit;

public class StraightFlush implements HandKind {

    @Override
    public String getName() {
        return "Straight_Flush";
    }

    @Override
    public boolean check(Hand hand) {
        Card[] cards = hand.getCards();
        return (isFlush(cards)) ? isStraight(cards) : false;
    }

    private boolean isFlush(Card[] cards) {
        Suit suit = cards[0].getSuit();
        for (int index = 0; index < cards.length; index++) {
            if (cards[index].getSuit() != suit) return false;
        }
        return true;
    }

    private boolean isStraight(Card[] cards) {
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
