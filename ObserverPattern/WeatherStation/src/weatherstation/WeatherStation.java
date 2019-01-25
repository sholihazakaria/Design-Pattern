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
public class WeatherStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeatherData wd = new WeatherData();
        CurrentConditionDisplay cd = new CurrentConditionDisplay(wd);
        StatisticDisplay statisticsDisplay = new StatisticDisplay(wd);
        ForecastDisplay forecastDisplay = new ForecastDisplay(wd);
        //2
        ForecastDisplay fd = new ForecastDisplay(wd);
        
        wd.setMeasurements(80, 65, 30.4f);
        wd.setMeasurements(82, 70, 29.2f);
        wd.setMeasurements(78, 90, 29.2f);
        
        
    }
    
}
