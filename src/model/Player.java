/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nguyenminhkhoa
 */
public class Player {
    
    private int score;
    private String color;
    private int trains; //number of train cars;
    private String[] trainCard, ticketCard;
    
    //initialize player with name, score, assign random color trains
    public Player(){
        //
    }
    
    //method to show the Train cards & Ticket Cards holding
    //(should this part be in View package?) 
    public void Display(){
        System.out.println();
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
