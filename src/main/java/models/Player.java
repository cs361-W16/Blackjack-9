package models;

/**
 * Created by Dilon_000 on 3/12/2016.
 */
public abstract class Player {

    public int total;

    public Player(){
        total = 0;
    }

    public int getGameValue(Card c){
        if(c.getValue() <= 10){
            return c.getValue();
        }
        else if(c.getValue() > 10 && c.getValue() < 14){
            return 10;
        }
        else{
            return 11;
        }
    }

    public void restart(){
        total = 0;
    }

    public abstract int stay();
}
