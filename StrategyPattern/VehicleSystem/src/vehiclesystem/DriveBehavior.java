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
public interface DriveBehavior {
    public void drive();
    
}

class candrive implements DriveBehavior{

    @Override
    public void drive() {
        System.out.println("Now I'm Driving.");
    }
    
}

class cannotdrive implements DriveBehavior{

    @Override
    public void drive() {
        System.out.println("I Can't Be Driving.");
    }
    
}
