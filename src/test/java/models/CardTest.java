package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paullantow on 3/13/16.
 */
public class CardTest {

    @Test
    public void testGetSuit() throws Exception {
        Card card = new Card(1,Suit.Spades);
        assertEquals(card.getSuit(),Suit.Spades);
    }

    @Test
    public void testGetValue() throws Exception {
        Card card = new Card(4,Suit.Spades);
        assertEquals(card.getValue(),4);
    }

    @Test
    public void testToString() throws Exception {
        Card card = new Card(10,Suit.Clubs);
        assertEquals(card.toString(),10+Suit.Clubs.toString());
    }
}