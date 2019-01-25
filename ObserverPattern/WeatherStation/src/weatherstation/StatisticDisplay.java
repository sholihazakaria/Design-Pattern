/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

/**
 *
 * @author Vadmin
 */
import java.util.Observer;
import java.util.Observable;

public class StatisticDisplay implements Observer,DisplayElement{
    Observable observable;
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
    
    public StatisticDisplay(Observable o){
        this.observable = o;
        observable.addObserver(this);
    }

    public void update(Observable o,Object args) {
        if(observable instanceof WeatherData) {
			WeatherData wd = (WeatherData)observable;
			tempSum += wd.getTemperature();
			numReadings++;
			if(wd.getTemperature()>maxTemp) {
				maxTemp = wd.getTemperature();
			}
			if(wd.getTemperature() < minTemp) {
				minTemp = wd.getTemperature();
			}
			display();
		}
    }
    public void display() {
        System.out.println("Avg/Max/Min temperature="+(tempSum/numReadings)+"/"+maxTemp+"/"+minTemp);}
}
