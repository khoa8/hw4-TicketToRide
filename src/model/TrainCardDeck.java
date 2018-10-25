
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import static model.VALUE.RAINBOW;
/**
 *
 * @author nguyenminhkhoa
 */
public class TrainCardDeck{
    
    private static List<TrainCard> cardDeck;
    
    //initialize and create the deck of train card
    
    public TrainCardDeck(){
        this.cardDeck = new ArrayList<>();
        
    //110 Train Car cards (12 each of Box-PINK, Passenger-WHITE, Tanker-BLUE, Reefer-YELLOW, 
    //Freight-ORANGE, Hopper-BLACK, Coal-RED, Caboose-GREEN, plus 14 Locomotives-RAINBOW)
    
        for(int i = 1 ; i <= 12 ; i++){
            for(VALUE color : VALUE.values()){
             cardDeck.add(new TrainCard(color));
            }
        }
        cardDeck.add(new TrainCard(RAINBOW));
        cardDeck.add(new TrainCard(RAINBOW));
    }
    
    //method to shuffle the deck
    public static void shuffle(){ 
         
        Collections.shuffle(cardDeck);
        /*Random rand = new Random();
        for(int i = 0 ; i < 110 ; i++){
            int firstCard = rand.nextInt(110);
            int secondCard = rand.nextInt(110);
            Collections.swap(cardDeck,firstCard,secondCard);
        }*/
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
    
    //Discard the deck for testing purpose
    public void discard(){
        for(int i = 1 ; i <= 110 ; i++) cardDeck.remove(i);
    }
    
    
    //method to return used train cards for reuse purpose when needed
    public TrainCard usedCard(){
       TrainCard removedCard = cardDeck.remove(0);
       return removedCard;
    }
    
    // return true if there are no cards left in the deck
    public boolean deckIsEmpty(){
        if (getSizeOfDeck() > 0) return false;
        return true;
    }

}
