package Model;

import Model.HandKind.HandKind;
import java.util.*;

public class Hand {

    private List<Card> cards;
    private HandKind kind;

    public Hand(Card[] cards) {
        this.cards = Arrays.asList(cards);
        sort();
    }

    private void sort() {
        Collections.sort(cards);
    }

    public HandKind getKind() {
        return kind;
    }

    public void setKind(HandKind kind) {
        this.kind = kind;
    }

    public Card[] getCards() {
        return cards.toArray(new Card[0]);
    }
}
