package Model;

import java.util.*;

public class Deck {

    private static ArrayList<Card> deck;
    private static ArrayList<Card> returnedCards;

    private Deck() {
    }
    
    private static void inicializeRound() {
        deck = new ArrayList<>();
        returnedCards = new ArrayList<>();
        for (Suit suit : Suit.SET) 
            for (Rank rank : Rank.SET) 
                deck.add(new Card(suit, rank));
    }

    public static void newRound() {
        if (deck == null) {
            inicializeRound();
        } else {
            deck.addAll(returnedCards);
            returnedCards.removeAll(returnedCards);
        }
    }

    public static Card getCard() {
        Random random = new Random();
        Card card = deck.get(random.nextInt(deck.size()));
        deck.remove(card);
        returnedCards.add(card);
        return card;
    }
}
