/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzz.coffee;

/**
 *
 * @author course009
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    
    String size = "TALL";
    
    public String getDescription(){
        return description;
    }
    
    public String getSize(){
        return size;
    }
    
    public void setSize(String sizeChosen){
        this.size = sizeChosen;
    }
    
    public abstract double cost();
    
}
