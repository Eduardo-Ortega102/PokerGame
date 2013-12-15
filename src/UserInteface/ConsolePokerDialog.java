package UserInteface;

import Model.Card;
import Model.Hand;
import Model.HandKind.HandKind;
import java.io.*;

public class ConsolePokerDialog implements PokerDialog {

    private Command command;

    public ConsolePokerDialog(Command command) {
        this.command = command;
    }

    @Override
    public void getPlayersNumber() {
        int playersNumber;
        while (true) {
            try {
                playersNumber = readAmount(new BufferedReader(new InputStreamReader(System.in)));
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Error: No ha introducido un número");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        command.execute(playersNumber);
    }

    private static int readAmount(BufferedReader reader) throws IOException {
        System.out.print("Introduzca el numero de jugadores: ");
        String amount = reader.readLine();
        return Integer.parseInt(amount);
    }

    @Override
    public void execute(Hand[] hand, HandKind[] dictionary) {
        for (int index = 0; index < hand.length; index++) {
            Card[] cards = hand[index].getCards();
            printCards(cards);
            System.out.println("");
            System.out.println(check(hand[index], dictionary));
            System.out.println();
        }
    }

    private static String check(Hand hand, HandKind[] dictionary) {
        for (HandKind handKind : dictionary) {
            if (handKind.check(hand)) {

                return handKind.getName();
            }
        }
        throw new RuntimeException("This never happen");
    }

    private void printCards(Card[] cards) {
        for (Card card : cards) {
            System.out.print(card + " ");
        }
    }
}
