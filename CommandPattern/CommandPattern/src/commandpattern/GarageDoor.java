/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

/**
 *
 * @author Sholiha
 */
public class GarageDoor {
    
    String area;
    
    public GarageDoor(String area){
        this.area = area;
    }
    
    public void up(){
        System.out.println(area+ "Garage Door UP");
    }
    
    public void down(){
        System.out.println(area+"Garage Door DOWN");
    }
    
    public void stop(){
        System.out.println(area+"Garage Door STOP");
    }
    
    public void lightOn(){
        System.out.println(area + "Garage Light ON");
    }
    
    public void lightOff(){
        System.out.println(area + "Garage Light OFF");
    }
}
