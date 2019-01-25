/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account.manager;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author Sholiha
 */
public class FileUtility {
    
    PrintStream writer;

    public FileUtility() {
        
    }
    
    public boolean WriteToFile(String filename, String dataLine){
        try{
            
            writer = new PrintStream(new FileOutputStream(filename, true));
            writer.println(dataLine);
            writer.close();
            return true;
           
        
        } catch(IOException e){
            System.out.println("cannot write");
            return false;
        }
        
    }
}
