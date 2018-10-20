/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;
/**
 *
 * @author nguyenminhkhoa
 */
public class TrainCardDeck {
    
    private TrainCard[] trainCard, usedTrainCard;
    
    //initialize and create the deck of train card
    public TrainCardDeck(){
        //
    }
    
    //method to shuffle the deck
    public static void shuffle(TrainCard[] traincard, int numberOfCurrentCard){ 
          
        Random rand = new Random(); 
        //for( ... ... ...){};
    }
    
    //method to draw the card from deck
    public TrainCard draw(){
        //
        return null;
    }
    
    //method to collect used train cards for reuse purpose when needed
    public void usedCard(TrainCard[] usedtraincard, TrainCard card){
        //
    }
    
    // return true if there are no cards left in the deck
    public boolean isEmpty(){
        //
        return false;
    }
}
