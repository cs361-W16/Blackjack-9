package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paullantow on 3/13/16.
 */
public class PlayerTest {

    @Test
    public void testGetGameValue() throws Exception {
        Card c = new Card(12,Suit.Hearts);
        Player p = new User();
        assertEquals(10, p.getGameValue(c));
    }

    @Test
    public void testRestart() throws Exception {
        Player p = new User();
        p.restart();
        assertEquals(0, p.total);
    }

    @Test
    public void testStay() throws Exception {
        Player p = new User();
        assertEquals(0,p.stay());
    }
}