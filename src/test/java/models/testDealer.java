package models;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Dilon_000 on 3/13/2016.
 */
public class testDealer {

    @Test
    public void testStay(){
        Dealer d = new Dealer();
        assertEquals(d.stay(), 0);
    }

    @Test
    public void testHit(){
        Dealer d = new Dealer();
        java.util.List<Card> deck = new ArrayList<>();
        deck.add(new Card(0, Suit.Clubs));
        Card c = d.hit(deck);
        assertNull(deck.get(0));
        assertEquals(c.getValue(), 0);
        assertEquals(c.getSuit(), Suit.Clubs);
    }

    @Test
    public void testGetGameValue(){
        Dealer d = new Dealer();
        Card c = new Card(13, Suit.Hearts);
        assertEquals(d.getGameValue(c), 10);
    }

    @Test
    public void testDealerPlayNoAce(){
        Dealer d = new Dealer();
        java.util.List<Card> row = new ArrayList<>();
        java.util.List<Card> deck = new ArrayList<>();
        row.add(new Card(8, Suit.Diamonds));
        row.add(new Card(9, Suit.Hearts));
        deck.add(new Card(4, Suit.Spades));
        assertEquals(d.dealerPlay(row, deck), 17);
        assertNull(row.get(2));
        assertNotNull(deck.get(0));
    }

    @Test
    public void testDealerPlayAce(){
        Dealer d = new Dealer();
        java.util.List<Card> row = new ArrayList<>();
        java.util.List<Card> deck = new ArrayList<>();
        row.add(new Card(10, Suit.Clubs));
        row.add(new Card(6, Suit.Hearts));
        deck.add(new Card(14, Suit.Diamonds));
        assertEquals(d.dealerPlay(row, deck), 17);
        assertNotNull(row.get(2));
        assertNull(deck.get(0));
    }

}
