/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguyenminhkhoa
 */
public class Player {
    
    private int score;
    private String color;
    private int trains; //number of train cars;
    private String[] trainCard, ticketCard;
    private final List<TrainCard> hand;
    //initialize player with name, score, assign random color trains
    

    public Player() {
        this.hand = new ArrayList<TrainCard>();
    }
    
    public List<TrainCard> getHand() {
        return hand;
    }

    @Override
    public String toString() {
        return "Player{" +
                "hand=" + hand +
                '}';
    }
   
    //method to add score
    public void addScore(int score1){
        //
    }
    
    //method to subtract score if not finishing missions when game ends
    public void subtractScore(int score1){
        //
    }
    
    //check for the longest path, if yes return true
    public boolean checkLongest(){
        return false;
    }
    
    //check for the longest path, if yes return true
    public void end(){
        //update number of trains left;
        checkLongest();
        //check whether the missions finish or not to update score;
        //calculate final score;
    }
    
}
