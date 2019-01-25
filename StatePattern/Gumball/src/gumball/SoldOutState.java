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
public class SoldOutState implements State{

    Gumball gumball;
    public SoldOutState(Gumball gumball) {
        this.gumball = gumball;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You cant insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You cant eject, you havent inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there is no gumball");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
}
