/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import model.Player;
import model.TrainCard;
import model.TrainCardDeck;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author nguyenminhkhoa
 */
public class TestClass {
    
    private TrainCardDeck deck;
    private Player player;
    
    public TestClass() {
    }
    
    @Before
    public void setUp() {
        deck = new TrainCardDeck();
        player = new Player();
    }

    @Test
    public void emptyDeck() {
        //test case for isEmpty() method from TrainCardDeck.class
        deck.discard();
        assertTrue(deck.deckIsEmpty());
    }
    
    @Test
    public void notEndGame() {
        //test case for endOfGame() method from Player.class
        assertFalse(player.endOfGame());
    }
    
}