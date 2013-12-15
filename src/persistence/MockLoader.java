package persistence;

import Model.Card;
import Model.Hand;
import Model.Rank;
import Model.Suit;

public class MockLoader implements Loader{

    @Override
    public Hand[] load(int playersNumber) {
        return new Hand[]{
            //--High Card
            new Hand(new Card[]{
                new Card(Suit.DIAMONDS, Rank.TWO),
                new Card(Suit.CLUBS, Rank.FIVE),
                new Card(Suit.HEART, Rank.SEVEN),
                new Card(Suit.SPADES, Rank.EIGHT),
                new Card(Suit.SPADES, Rank.AS)}),
            //--3 of a kind
            new Hand(new Card[]{
                new Card(Suit.DIAMONDS, Rank.TWO),
                new Card(Suit.HEART, Rank.NINE),
                new Card(Suit.CLUBS, Rank.TWO),
                new Card(Suit.SPADES, Rank.TWO),
                new Card(Suit.SPADES, Rank.SEVEN)}),
            //--Full
            new Hand(new Card[]{
                new Card(Suit.DIAMONDS, Rank.FIVE),
                new Card(Suit.HEART, Rank.FIVE),
                new Card(Suit.HEART, Rank.SEVEN),
                new Card(Suit.CLUBS, Rank.FIVE),
                new Card(Suit.SPADES, Rank.SEVEN)}),
            //--1 pair 
            new Hand(new Card[]{
                new Card(Suit.DIAMONDS, Rank.TWO),
                new Card(Suit.CLUBS, Rank.FIVE),
                new Card(Suit.HEART, Rank.SEVEN),
                new Card(Suit.DIAMONDS, Rank.EIGHT),
                new Card(Suit.SPADES, Rank.SEVEN)}),
            //--Royal Flush
            new Hand(new Card[]{
                new Card(Suit.DIAMONDS, Rank.AS),
                new Card(Suit.DIAMONDS, Rank.TEN),
                new Card(Suit.DIAMONDS, Rank.K),
                new Card(Suit.DIAMONDS, Rank.J),
                new Card(Suit.DIAMONDS, Rank.Q)}),
            //--2 pair
            new Hand(new Card[]{
                new Card(Suit.DIAMONDS, Rank.TWO),
                new Card(Suit.CLUBS, Rank.FIVE),
                new Card(Suit.HEART, Rank.SEVEN),
                new Card(Suit.DIAMONDS, Rank.FIVE),
                new Card(Suit.SPADES, Rank.SEVEN)}),
            //--Straight
            new Hand(new Card[]{
                new Card(Suit.DIAMONDS, Rank.SIX),
                new Card(Suit.CLUBS, Rank.FIVE),
                new Card(Suit.HEART, Rank.SEVEN),
                new Card(Suit.DIAMONDS, Rank.EIGHT),
                new Card(Suit.SPADES, Rank.FOUR)}),
            //--4 of a kind
            new Hand(new Card[]{
                new Card(Suit.DIAMONDS, Rank.TWO),
                new Card(Suit.HEART, Rank.TWO),
                new Card(Suit.CLUBS, Rank.TWO),
                new Card(Suit.SPADES, Rank.TWO),
                new Card(Suit.SPADES, Rank.SEVEN)}),
            //--Straight Flush
            new Hand(new Card[]{
                new Card(Suit.CLUBS, Rank.SIX),
                new Card(Suit.CLUBS, Rank.FIVE),
                new Card(Suit.CLUBS, Rank.SEVEN),
                new Card(Suit.CLUBS, Rank.EIGHT),
                new Card(Suit.CLUBS, Rank.FOUR)}),
            //--Flush
            new Hand(new Card[]{
                new Card(Suit.CLUBS, Rank.SIX),
                new Card(Suit.CLUBS, Rank.TWO),
                new Card(Suit.CLUBS, Rank.TEN),
                new Card(Suit.CLUBS, Rank.EIGHT),
                new Card(Suit.CLUBS, Rank.FOUR)}),
        };
    }

}
