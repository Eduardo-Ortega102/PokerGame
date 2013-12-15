package Model.HandKind;

import Model.Card;
import Model.Hand;
import Model.Rank;
import java.util.*;

public class Full implements HandKind {

    @Override
    public boolean check(Hand hand) {
        ArrayList<Card> cards = new ArrayList<>();
        cards.addAll(Arrays.asList(hand.getCards()));
        if (threeOfaKind(cards)) {
            return isPair(cards);
        }
        return false;
    }

    private boolean threeOfaKind(ArrayList<Card> hand) {
        Card[] cards = hand.toArray(new Card[0]);
        for (int i = 1; i < 3; i++) {
            int count = 1;
            Rank rank = cards[i - 1].getRank();
            for (int index = i; index < cards.length; index++) {
                if (cards[index].getRank() == rank) count++;
                if (count == 3){
                    remove(hand, rank);
                    return true;
                }
            }
        }
        return false;
    }

    private void remove(ArrayList<Card> cards, Rank rank) {
        Card[] card = cards.toArray(new Card[0]);
        for (int i = 0; i < card.length; i++) {
            if (card[i].getRank() == rank) cards.remove(card[i]);
        }
    }

    private boolean isPair(ArrayList<Card> cards) {
        if (cards.size() != 2)
            throw new RuntimeException("This never happend");
        return (cards.get(0).getRank() == cards.get(1).getRank()) ? true : false;
    }

    @Override
    public String getName() {
        return "Full";
    }
}
