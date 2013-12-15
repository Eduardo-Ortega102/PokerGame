package Model;

import java.util.*;

public class Hand {

    private List<Card> cards;

    public Hand(Card[] cards) {
        this.cards = Arrays.asList(cards);
        sort();
    }

    private void sort() {
        Collections.sort(cards);
    }

    public Card[] getCards() {
        return cards.toArray(new Card[0]);
    }
}
