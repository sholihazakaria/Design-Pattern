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
public class Stereo {
    
    String area;
    
    public Stereo(String area){
        this.area = area;
    }
    public void on(){
        System.out.println(area+" Stereo ON");
    }
    
    public void off(){
        System.out.println(area + " Stereo OFF");
    }
    
    public void setCd(){
        System.out.println(area+" Stereo play CD");
    }
    
    public void setradio(){
        System.out.println(area+" Stereo set the redio");
    }
    
    public void setVolume(int volume){
        System.out.println(area+" Stereo Volume Set to : " + volume);
    }
}
