package Model.PokerKind;

import Model.HandKind.HandKind;

public class TexasHoldemPoker implements PokerKind{
    
    private static final HandKind[] HandKindSet = HandKindDictionary.HOLDEM_POKER;

    @Override
    public HandKind[] getHandKindDictionary() {
        return HandKindSet;
    }

    @Override
    public Integer getHandWeight(HandKind handKind) {
        for (int index = 0; index < HandKindSet.length; index++) {
            if(HandKindSet[index] == handKind) return index;
        }
        throw new RuntimeException("This never happend");
    }

}
