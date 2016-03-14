package models;

/**
 * Created by Dilon_000 on 3/13/2016.
 */
public class User extends Player {

    public User(){
        total = 0;
    }

    public void userHit(java.util.List<Card> deck, java.util.List<Card> row){
        row.add(deck.get(deck.size() - 1));
        int v = getGameValue(deck.get(deck.size() - 1));
        deck.remove(deck.size() - 1);
        if(v == 11 && (v + total) > 21){
            v = 1;
        }
        total = total + v;
    }

    public void split(){

    }

    public void doubleDown(){

    }

    public int stay(){
        return total;
    }
}
