/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gumball;

/**
 *
 * @author Sholiha
 */
public class Gumball {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state;
    int count = 0;
    
    public Gumball(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        
        this.count = numberGumballs;
        if(numberGumballs>0){
            state = noQuarterState;
        }else{
            state = soldOutState;
        }
    }
    
    public void insertQuarter(){
        state.insertQuarter();
    }
    
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0){
            count = count -1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }
    
    
    public String toString(){
        return "Mighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004"
                + "\nInventory: "+count+" gumballs\nMachine is waiting for quarter";
    }
    
   
}
