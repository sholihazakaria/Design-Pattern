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
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int fanSpeed;
    String area;
    
    public CeilingFan(String area){
        this.area = area;
    }
    
    public void on(){
        System.out.println(area + " Ceiling Fan ON");
    }
    
    public void off(){
        System.out.println(area+" Ceiling Fan OFF");
    }
    
    public void high(){
        fanSpeed = HIGH;
        System.out.println(area + " Ceiling Fan High Speed");
    }
    
    public void medium(){
        fanSpeed = MEDIUM;
        System.out.println(area + " Ceiling Fan Medium Speed");
    }
    
    public void low(){
        fanSpeed = LOW;
        System.out.println(area + " Ceiling Fan Low Speed");
    }
    
    public int getSpeed(){
        return fanSpeed;
    }
}
