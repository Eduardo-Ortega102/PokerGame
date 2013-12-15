package Model.HandKind;

import Model.Hand;


public class HighCard implements HandKind {

    @Override
    public boolean check(Hand hand) {
        return true;
    }

    @Override
    public String getName() {
        return "High_Card";
    }

}
