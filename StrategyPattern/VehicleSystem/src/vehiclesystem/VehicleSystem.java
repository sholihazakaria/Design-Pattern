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
public class VehicleSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle sr = new StreetRacer();
        Vehicle fo = new FormulaOne();
        Vehicle ac = new Aircraft();
        
        sr.display();
        sr.performDrive();
        fo.display();
        fo.performDrive();
        ac.display();
        ac.performFly();
        System.out.println("I am a helicopter which is flying. I am arriving at the runway.");
        ac.performDrive();
        ac.setDriveBehavior(new cannotdrive());
        ac.performDrive();
    }
    
}
