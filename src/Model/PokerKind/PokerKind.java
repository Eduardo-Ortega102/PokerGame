package Model.PokerKind;

import Model.HandKind.HandKind;

public interface PokerKind {
    
    public HandKind[] getHandKindDictionary();
    
    public Integer getHandWeight(HandKind handKind);

}
