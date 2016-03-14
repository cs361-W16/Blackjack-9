package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paullantow on 3/13/16 .
 */
public class BlackjackTest {

    @Test
    public void testClearBoard() throws Exception {
//        Blackjack b = new Blackjack();
//        b.buildDeck();
//        b.playerHit();
//        b.dealerHit();
//        b.clearBoard();
//        assertNull(b.deck);
//        assertNull(b.cols.get(0));
//        assertNull(b.cols.get(1));
//
    }

    @Test
    public void testBuildDeck() throws Exception {
//        Blackjack b = new Blackjack();
//        b.buildDeck();
//        assertEquals(b.deck.get(0).getValue(), 2);
    }

    @Test
    public void testShuffle() throws Exception {
        Blackjack b = new Blackjack();
        b.buildDeck();
        b.shuffle();
        assertNotEquals(b.deck.get(0).getValue(), 2);
    }

    @Test
    public void testStartHand() throws Exception {
        Blackjack b = new Blackjack();
        b.buildDeck();
        b.startHand();
        assertNotNull(b.cols.get(0).get(0));
        assertNotNull(b.cols.get(1).get(0));
    }

    @Test
    public void testPlayerHit() throws Exception {
        Blackjack b = new Blackjack();
        b.buildDeck();
        b.playerHit();
        assertNotNull(b.cols.get(1).get(0));
        assertNotNull(b.cols.get(1).get(1));
    }

    @Test
    public void testDealerHit() throws Exception {
        Blackjack b = new Blackjack();
        b.buildDeck();
        b.dealerHit();
        assertNotNull(b.cols.get(0).get(0));
        assertNotNull(b.cols.get(0).get(1));
    }

    @Test
    public void testDPlay() throws Exception {
        Blackjack b = new Blackjack();
        b.buildDeck();
        b.dealerHit();
        b.dealerHit();
        b.dPlay();
        assertNotNull(b.dealerTotal);
    }

    @Test
    public void testScoring() throws Exception {
        Blackjack b = new Blackjack();
        b.dealerTotal = 15;
        b.userTotal = 17;
        assertEquals(b.scoring(), "You Win!");
    }

    @Test
    public void testCustomDeal() throws Exception {
//        Blackjack b = new Blackjack();
//        b.buildDeck();
//        b.customDeal(1, 3, 5, 7);
//        assertEquals(b.cols.get(0).get(0).getValue(), 3);
//        assertEquals(b.cols.get(1).get(0).getValue(), 5);
    }

    @Test
    public void testRemove() throws Exception {
        Blackjack b = new Blackjack();
        b.buildDeck();
        b.cols.get(0).add(b.deck.get(0));
        b.cols.get(1).add(b.deck.get(4));
        b.remove(0);
        assertNull(b.cols.get(0).get(0));
    }

    @Test
    public void testMove() throws Exception {
        Blackjack b = new Blackjack();
        b.buildDeck();
        b.cols.get(0).add(b.deck.get(0));
        b.move(0, 1);
        assertNull(b.cols.get(0).get(0));
    }
}