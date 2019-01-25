/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gumball;

import java.util.Random;

/**
 *
 * @author Sholiha
 */
public class HasQuarterState implements State{

    Gumball gumball;
    Random randomWinner = new Random(System.currentTimeMillis());
    
    public HasQuarterState(Gumball gumball) {
        this.gumball = gumball;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cant insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumball.setState(gumball.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned....");
        
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (gumball.getCount() > 1)){
            gumball.setState(gumball.getWinnerState());
        }else{
            gumball.setState(gumball.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
}
