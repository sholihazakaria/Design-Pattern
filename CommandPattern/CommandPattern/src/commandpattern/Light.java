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
public class Light {
    String area;
    
    public Light(String area){
        this.area = area;
    }
    
    public void on(){
        System.out.println(area + " Light ON");
    }
    
    public void off(){
        System.out.println(area + " Light OFF");
    }
}
