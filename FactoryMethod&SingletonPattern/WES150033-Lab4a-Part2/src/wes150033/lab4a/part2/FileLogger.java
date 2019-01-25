/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wes150033.lab4a.part2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Timestamp;

/**
 *
 * @author Sholiha
 */
public class FileLogger implements Logger{
    String msg;
    Timestamp ts;
    
    @Override
    public void log(String msg) {
        ts = new Timestamp(System.currentTimeMillis());
        this.msg = msg;
        try{
            PrintStream ps = new PrintStream(new FileOutputStream("log.txt",true));
            ps.println(ts +": "+msg);
            ps.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
       
    }
}
