/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wes150033.lab4a.part2;

import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Sholiha
 */
public class LoggerFactory {
    
    ConsoleLogger cl;
    FileLogger fl;
        
    public Logger getLogger(){
        
        if(ifFileLoggingEnabled()){
            fl = new FileLogger();
             return fl;
        }
        else{
            cl = new ConsoleLogger();
            return cl;
        }
        
    }
    
    public boolean ifFileLoggingEnabled(){
        Properties p = new Properties();
        try{
            p.load(ClassLoader.getSystemResourceAsStream("logger.properties"));
            String fileLoggingValue = p.getProperty("FileLogging");
            if (fileLoggingValue.equalsIgnoreCase("ON") == true)
                return true;
            else
                return false;
        } catch(IOException e){
            e.printStackTrace();
            return false;
        }
    }
}
