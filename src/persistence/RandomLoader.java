package persistence;

import Model.Card;
import Model.Deck;
import Model.Hand;

public class RandomLoader implements Loader {

    @Override
    public Hand[] load(int playersNumber) {
        Deck.newRound();
        Hand[] playersHands = new Hand[playersNumber];
        
        for (int index = 0; index < playersHands.length; index++) {
            playersHands[index] = new Hand(new Card[]{
                Deck.getCard(), Deck.getCard(), Deck.getCard(), Deck.getCard(), Deck.getCard()
            });
        }
        return playersHands;
    }
}
