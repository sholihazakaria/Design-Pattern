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
public abstract class Vehicle {
    FlyBehavior flybehavior;
    DriveBehavior drivebehavior;
    
    
    public Vehicle(){
        
    }
    
    public abstract void display();
    
    public void performDrive(){
        drivebehavior.drive();
    }
    
    public void performFly(){
        flybehavior.fly();
    }
    
    public void setDriveBehavior(DriveBehavior db){
        drivebehavior = db;
    }
    
    public void setFlyBehavior(FlyBehavior fb){
        flybehavior = fb;
    }
}
