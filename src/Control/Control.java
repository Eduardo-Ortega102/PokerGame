package Control;

import Model.*;
import Model.HandKind.HandKind;
import Model.PokerKind.PokerKind;
import UserInteface.PokerDialog;
import persistence.Loader;

public class Control {

    private static HandKind[] dictionary;
    private static PokerDialog viewer;
    private static PokerKind poker;
    private static Loader loader;
    public static final Control CONTROL = new Control();

    private Control() {
    }

    public void execute(Loader loader, PokerKind poker, PokerDialog viewer) {
        Control.loader = loader;
        Control.dictionary = poker.getHandKindDictionary();
        Control.viewer = viewer;
        Control.viewer.getPlayersNumber();
    }

    public static void start(int playersNumber) {
        Hand[] hand = loader.load(playersNumber);
        
        viewer.execute(hand, dictionary);
    }
}
