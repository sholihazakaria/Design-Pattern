/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.logging;

/**
 *
 * @author course009
 */
public class ConsoleLogger implements Logger{

    String msg;
    @Override
    public void log(String msg) {
        this.msg = msg;
        System.out.println(msg);
    }
    
    
}
