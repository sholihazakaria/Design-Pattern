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
public class SoldState implements State{

    Gumball gumball;
    public SoldState(Gumball gumball) {
        this.gumball = gumball;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesnt get you another gumball");
    }

    @Override
    public void dispense() {
        gumball.releaseBall();
        if(gumball.getCount() > 0){
            gumball.setState(gumball.getNoQuarterState());
        }else{
            System.out.println("Oops, out of gumballs!");
            gumball.setState(gumball.getSoldOutState());
        }
    }
    
}
