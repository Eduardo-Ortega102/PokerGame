package Model;

public class Rank {

    public static final Rank AS = new Rank();
    public static final Rank K = new Rank();
    public static final Rank Q = new Rank();
    public static final Rank J = new Rank();
    public static final Rank TEN = new Rank();
    public static final Rank NINE = new Rank();
    public static final Rank EIGHT = new Rank();
    public static final Rank SEVEN = new Rank();
    public static final Rank SIX = new Rank();
    public static final Rank FIVE = new Rank();
    public static final Rank FOUR = new Rank();
    public static final Rank THREE = new Rank();
    public static final Rank TWO = new Rank();
    public static final Rank[] SET = {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K, AS};

    public static int indexOf(Rank rank) {
        for (int i = 0; i < SET.length; i++) {
            if(SET[i] == rank) return i;
        }
        throw new RuntimeException("This never happend");
    }

    private Rank() {
    }

    public static Integer getValue(Rank rank) {
        for (int index = 0; index < SET.length; index++) {
            if (SET[index] == rank) return index + 2;
        }
        throw new RuntimeException("Rank not found");
    }
    
}
