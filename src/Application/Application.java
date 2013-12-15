package Application;

import Control.Control;
import UserInteface.Command;
import Model.PokerKind.*;
import UserInteface.*;
import persistence.*;

public class Application {

    public static void main(String[] args) {

        PokerKind poker = createPokerGame();
        Loader loader = createLoader();
        Control control = Control.CONTROL;
        
        PokerDialog viewer = createViewer(new Command() {
            @Override
            public void execute(int playersNumber) {
                Control.start(playersNumber);
            }
        });
        
        control.execute(loader, poker, viewer);
    }

    private static PokerKind createPokerGame() {
        return new TexasHoldemPoker();
    }

    private static Loader createLoader() {
        return new RandomLoader();
//        return new MockLoader();
    }

    private static PokerDialog createViewer(Command command) {
        return new ConsolePokerDialog(command);
    }
}
