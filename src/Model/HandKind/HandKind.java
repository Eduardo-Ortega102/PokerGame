package Model.HandKind;

import Model.Hand;

public interface HandKind {

    public boolean check(Hand hand);

    public String getName();
}
