package models;

/**
 * Created by Dilon_000 on 3/13/2016.
 */
public class User extends Player {

    public User(){
        total = 0;
    }

    public Card hit(java.util.List<Card> deck){
        return new Card(0, Suit.Clubs);
    }

    public void split(){

    }

    public void doubleDown(){

    }

    public int stay(){
        return 0;
    }
}
