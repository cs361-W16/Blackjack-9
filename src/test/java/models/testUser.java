package models;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Dilon_000 on 3/13/2016.
 */
public class testUser {

    @Test
    public void testUserHit() {
        User person = new User();
        java.util.List<Card> deck = new ArrayList<>();
        java.util.List<Card> row = new ArrayList<>();
        deck.add(new Card(0, Suit.Hearts));
        person.userHit(deck, row);
        assertNull(deck.get(0));
        assertEquals(row.get(0).suit, Suit.Hearts);
    }

    @Test
    public void doubleDown() {
        User person = new User();
        Dealer dealer = new Dealer();
        java.util.List<Card> deck = new ArrayList<>();
        java.util.List<Card> userRow = new ArrayList<>();
        java.util.List<Card> dealerRow = new ArrayList<>();
        deck.add(new Card(0, Suit.Spades));
        person.doubleDown(deck, userRow, dealer, dealerRow);
        assertNull(deck.get(0));
        assertEquals(userRow.get(0).suit, Suit.Spades);
    }


}
