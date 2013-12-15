package Control;

import Model.*;
import Model.HandKind.HandKind;
import Model.PokerKind.PokerKind;
import UserInteface.PokerDialog;
import persistence.Loader;

public class Control {

    private static HandKind[] dictionary;
    private static PokerDialog pokerDialog;
    private static PokerKind poker;
    private static Loader loader;
    public static final Control CONTROL = new Control();

    private Control() {
    }

    public void execute(Loader loader, PokerKind poker, PokerDialog viewer) {
        Control.loader = loader;
        Control.dictionary = poker.getHandKindDictionary();
        Control.pokerDialog = viewer;
        Control.pokerDialog.getPlayersNumber();
    }

    public static void start(int playersNumber) {
        Hand[] hand = loader.load(playersNumber);
        
        for (int i = 0; i < hand.length; i++) {
            HandKind ha = poker.check(hand[i]);
            hand[i].setKind(ha);
        }
        
        for (Hand hand1 : hand) {
            System.out.println(hand1.getKind().getName());
        }
        
        
//        pokerDialog.execute(hand, dictionary);
    }
}
