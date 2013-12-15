package Model;

public class Card implements Comparable<Card> {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card other) {
        return Rank.getValue(rank).compareTo(Rank.getValue(other.getRank()));
    }

    @Override
    public String toString() {
        return analizeRank()+ "_" + Suit.getName(suit);
    }

    private String analizeRank() {
        switch(Rank.getValue(rank)){
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            case 14:
                return "A";
            default:
                return Rank.getValue(rank).toString();
        }
    }
}
