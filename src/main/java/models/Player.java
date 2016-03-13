package models;

import java.util.ArrayList;

/**
 * Created by Dilon_000 on 3/12/2016.
 */
public abstract class Player {

    public int total;

    public Player(){
        total = 0;
    }

    public abstract Card hit(java.util.List<Card> deck);

    public abstract int stay();
}
