package Model.PokerKind;

import Model.Hand;
import Model.HandKind.HandKind;

public interface PokerKind {
    
    public HandKind[] getHandKindDictionary();
    
    public Integer getHandWeight(HandKind handKind);
    
    public HandKind check(Hand hand);

}
