package persistence;

import Model.Hand;

public interface Loader {
    
    public Hand[] load(int playersNumber);

}
