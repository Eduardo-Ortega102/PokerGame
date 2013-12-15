package Model;

public class Suit {

    public static final Suit HEART = new Suit();
    public static final Suit SPADES = new Suit();
    public static final Suit CLUBS = new Suit();
    public static final Suit DIAMONDS = new Suit();
    public static final Suit[] SET = {HEART, SPADES, CLUBS, DIAMONDS};

    private Suit() {
    }

    public static String getName(Suit suit) {
        for (int index = 0; index < SET.length; index++) {
            if (SET[index] == suit) return get(index);
        }
        throw new RuntimeException("This never happend");
    }

    private static String get(int index) {
        switch (index) {
            case 0:
                return "Heart";
            case 1:
                return "Spades";
            case 2:
                return "Clubs";
            default:
                return "Diamonds";
        }
    }
}
