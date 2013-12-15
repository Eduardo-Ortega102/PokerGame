package Model.PokerKind;

import Model.HandKind.*;

public class HandKindDictionary {

    public static final RoyalFlush ROYAL_FLUSH = new RoyalFlush();
    public static final StraightFlush STRAIGHT_FLUSH = new StraightFlush();
    public static final FourOfAKind FOUR_OF_A_KIND = new FourOfAKind();
    public static final Full FULL = new Full();
    public static final Flush FLUSH = new Flush();
    public static final Straight STRAIGHT = new Straight();
    public static final ThreeOfAKind THREE_OF_A_KIND = new ThreeOfAKind();
    public static final TwoPair TWO_PAIR = new TwoPair();
    public static final OnePair ONE_PAIR = new OnePair();
    public static final HighCard HIGH_CARD = new HighCard();
    
    public static final HandKind[] HOLDEM_POKER = {
        ROYAL_FLUSH, STRAIGHT_FLUSH, FOUR_OF_A_KIND, FULL, FLUSH,
        STRAIGHT, THREE_OF_A_KIND, TWO_PAIR, ONE_PAIR, HIGH_CARD};
}
