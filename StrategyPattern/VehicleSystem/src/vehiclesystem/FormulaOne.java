/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclesystem;

/**
 *
 * @author Sholiha
 */
public class FormulaOne extends Vehicle{
    
    public FormulaOne(){
        drivebehavior = new candrive();
        flybehavior = new cannotFly();
    }

    @Override
    public void display() {
        System.out.print("I'm a Formula One. ");
    }
    
}
