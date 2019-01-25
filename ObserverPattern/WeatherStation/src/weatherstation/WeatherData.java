/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

import java.util.ArrayList;

/**
 *
 * @author Vadmin
 */
import java.util.Observer;
import java.util.Observable;

public class WeatherData extends Observable {
    
    private float Temperature, Humidity, Pressure;
    private ArrayList<Observer> observers;
    
    public WeatherData(){
       
        //observers = new ArrayList<Observer>();
    }
    
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

//   @Override
//    public void registerObserver(Observer o) {
//        observers.add(o);
//    }
//
//    @Override
//    public void removeObserver(Observer o) {
//        int i = observers.indexOf(o);
//        if( i >= 0){
//            observers.remove(i);
//        }
//    }
        
    
//    @Override
//    public void notifyObservers() {
//        for (Observer observer : observers){
//            observer.update(new Observable(),createdata(Temperature,Humidity,Pressure));
//        }
//    }
    
    public void setMeasurements(float Temperature,float Humidity,float Pressure){
        this.Temperature = Temperature;
        this.Humidity = Humidity;
        this.Pressure = Pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return Temperature;
    }

    public void setTemperature(float Temperature) {
        this.Temperature = Temperature;
    }

    public float getHumidity() {
        return Humidity;
    }

    public void setHumidity(float Humidity) {
        this.Humidity = Humidity;
    }

    public float getPressure() {
        return Pressure;
    }

    public void setPressure(float Pressure) {
        this.Pressure = Pressure;
    }
    

    
    
}

