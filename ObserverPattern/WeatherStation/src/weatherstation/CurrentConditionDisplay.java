/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Vadmin
 */
public class CurrentConditionDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    private Observable observable;
    
    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
        
    }
    
    @Override
    public void update(Observable o ,Object wd){
        if(o instanceof WeatherData) {
			WeatherData w = (WeatherData)o;
			this.temperature = w.getTemperature();
			this.humidity = w.getHumidity();
			display();
		}
        
       
    }
    
    public void display(){
        System.out.println("Current conditions: "+ this.temperature+"F degrees and "+this.humidity+"% humidity");
    }
  
}
