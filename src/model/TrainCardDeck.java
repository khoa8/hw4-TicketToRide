/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
 *
 * @author nguyenminhkhoa
 */
public class TrainCardDeck {
    
    static List<TrainCard> cardDeck;
    private TrainCard[] trainCard, usedTrainCard;
    
    //initialize and create the deck of train card
    
    public TrainCardDeck(){
        this.cardDeck = new ArrayList<>();
        for(int value = 1 ; value <= 9 ; value++){
            for(COLOR color : COLOR.values()){
             cardDeck.add(new TrainCard(value,color));
            }
        }
    }
    
    //method to shuffle the deck
    public static void shuffle(TrainCard[] traincard, int numberOfCurrentCard){ 
           
        Random rand = new Random();
        for(int i = 0 ; i < 144 ; i++){
            int firstCard = rand.nextInt(144);
            int secondCard = rand.nextInt(144);
            Collections.swap(cardDeck,firstCard,secondCard);
            //Collections.shuffle(cardDeck);
        }
    }
    
    //method to draw the card from deck
    public TrainCard draw(){
        if (cardDeck.size() > 0)
            return cardDeck.remove(0);
        return null;
    }
    
    public void dealCard(Player player){
        //Get next card and add to hand of the player
        TrainCard removedCard = draw();
        player.getHand().add(removedCard);
    }


    //Size of the deck for testing purpose
    public int getSizeOfDeck(){
        return cardDeck.size();
    }
    
    
    //method to collect used train cards for reuse purpose when needed
    public TrainCard usedCard(TrainCard[] usedtraincard, TrainCard card){
       TrainCard removedCard = cardDeck.remove(0);
       return removedCard;
    }
    
    // return true if there are no cards left in the deck
    public boolean isEmpty(){
        if (getSizeOfDeck() > 0) return true;
        return false;
    }
}
