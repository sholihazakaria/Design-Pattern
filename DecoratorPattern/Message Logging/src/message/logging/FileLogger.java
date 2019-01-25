/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.logging;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


/**
 *
 * @author course009
 */
public class FileLogger implements Logger{
    String msg;
    @Override
    public void log(String msg) {
        this.msg = msg;
        try{
            PrintStream ps = new PrintStream(new FileOutputStream("log.txt",true));
            ps.println(msg);
            ps.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
     
}