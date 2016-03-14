package models;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

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


}
