package Model.PokerKind;

import Model.Hand;
import Model.HandKind.HandKind;

public class TexasHoldemPoker implements PokerKind {

    private static final HandKind[] HandKindSet = HandKindDictionary.HOLDEM_POKER;

    public TexasHoldemPoker() {
    }

    @Override
    public HandKind[] getHandKindDictionary() {
        return HandKindSet;
    }

    @Override
    public Integer getHandWeight(HandKind handKind) {
        for (int index = 0; index < HandKindSet.length; index++) {
            if (HandKindSet[index] == handKind) return index;
        }
        throw new RuntimeException("This never happend");
    }

    @Override
    public HandKind check(Hand hand) {
        for (HandKind handKind : HandKindSet) {
            if (handKind.check(hand)) {
                return handKind;
            }
        }
        throw new RuntimeException("This never happen");
    }
}
