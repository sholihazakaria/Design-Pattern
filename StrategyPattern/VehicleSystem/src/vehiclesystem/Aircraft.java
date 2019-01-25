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
public class Aircraft extends Vehicle{
    
    public Aircraft(){
        drivebehavior = new candrive();
        flybehavior = new canFly();
    }

    @Override
    public void display() {
        System.out.print("I'm a Helicopter. ");
    }
    
    
}
