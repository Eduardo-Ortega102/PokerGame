package Model.HandKind;

import Model.Card;
import Model.Hand;
import Model.Rank;
import Model.Suit;

public class RoyalFlush implements HandKind {

    @Override
    public boolean check(Hand hand) {
        Card[] cards = hand.getCards();
        if (isFlush(cards)) {
            Rank[] rank = Rank.SET;
            for (int index = 0; index < cards.length; index++) {
                if (cards[index].getRank() != rank[index + 8]) return false;
            }
            return true;
        }
        return false;
    }

    private boolean isFlush(Card[] cards) {
        Suit suit = cards[0].getSuit();
        for (int index = 0; index < cards.length; index++) {
            if (cards[index].getSuit() != suit) return false;
        }
        return true;
    }

    @Override
    public String getName() {
        return "Royal_Flush";
    }
}
