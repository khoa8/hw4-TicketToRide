/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nguyenminhkhoa
 */
enum CAR {
     BLUEcar, YELLOWcar, BLACKcar, REDcar, GREENcar;
}

public class Player {
    
    private int score;
    private String name;
    private int trains; //number of train cars;
    private final List<TrainCard> hand;
    //private static final List<CAR> train = new ArrayList<>();
    //private static final int SIZE = train.size();
    //private static final Random rand = new Random();
    
    
    //initialize player with name, score, assign random color trains
    public Player(){
        this.hand = new ArrayList<>();
        //train.addAll(Arrays.asList(CAR.values()));
        this.name = "A"; 
        score = 0;
        trains = 45;
    }
    
    public List<TrainCard> getHand(){
        return hand;
    }

    @Override
    public String toString() {
        return "Player " + name + " {" +
                "hand=" + hand + "}";
    }
   
    //method to add score
    public void addScore(int score){
        this.score += score; 
    }
    
    //method to subtract score if not finishing missions when game ends
    public void subtractScore(int score){
        this.score -= score;
    }
    
    //When player’s stock of colored trains gets down 
    //to less than 3 trains at the end of turn, the game is going to end.
    public boolean endOfGame(){
        return trains < 3;
    }
    
    public void setTrains(int num){
        this.trains = num;
    }
    
    public void end(){
        //update number of trains left;
        endOfGame();
        //check whether the missions finish or not to update score;
        //calculate final score;
    }
    
}
