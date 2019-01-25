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
public interface FlyBehavior {
    public void fly();
}

class canFly implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Now I'm Flying.");
    }
    
}

class cannotFly implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't Be Flying");
    }
    
}
