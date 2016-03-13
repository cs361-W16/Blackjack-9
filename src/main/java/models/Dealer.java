package models;

/**
 * Created by Dilon_000 on 3/12/2016.
 */
public class Dealer extends Player {

    public Dealer(){
        total = 0;
    }

    public Card hit(java.util.List<Card> deck){
        Card c = deck.get(deck.size() - 1);
        deck.remove(deck.size() - 1);
        return c;
    }

    public int stay(){
        return total;
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

    public int dealerPlay(java.util.List<Card> dealerRow, java.util.List<Card> deck){
        int v1 = getGameValue(dealerRow.get(0));
        int v2 = getGameValue(dealerRow.get(1));
        if(v1 == 11 && (v1 + v2) > 21){
            v1 = 1;
        }
        if(v2 == 11 && (v1 + v2) > 21){
            v2 = 1;
        }
        total = v1 + v2;

        int r = 2;
        int v;
        while(total < 17) {
            dealerRow.add(hit(deck));
            v = getGameValue(dealerRow.get(r));
            if(v == 11 && (total + v) > 21){
                v = 1;
            }
            total = total + v;
            r = r + 1;
        }
        return stay();
    }

}
