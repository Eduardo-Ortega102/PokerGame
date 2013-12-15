package UserInteface;

import Model.Hand;
import Model.HandKind.HandKind;

public interface PokerDialog {

    public void getPlayersNumber();

    public void execute(Hand[] hand, HandKind[] dictionary);
}
