/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wes150033.lab4a.part1;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Properties;

/**
 *
 * @author Sholiha
 */
public class LoggerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConsoleLogger cl;
        FileLogger fl;
        String message = "hello, how are you?";
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        
        if(ifFileLoggingEnabled()){
             fl = new FileLogger();
             fl.log(ts + ": " +message);
        }
        else{
            cl = new ConsoleLogger();
            cl.log(ts + ": " +message);
        }
        
        
    }
    
    public static boolean ifFileLoggingEnabled(){
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
