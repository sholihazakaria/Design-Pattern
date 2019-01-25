/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message.logging;

import java.sql.Timestamp;

/**
 *
 * @author Sholiha
 */
public class HTMLLogger extends LoggerDecorator{
    
     String header = "<HTML><BODY><b>";
    String footer = "</b></BODY></HTML>";
    String msg;
    Logger logger;
    //Timestamp ts = new Timestamp(System.currentTimeMillis());
    
    public HTMLLogger(Logger logger){
        this.logger = logger;
    }
    
    @Override
    public void log(String msg) {
        this.msg =  msg;
        msg = header +msg + footer;
        logger.log(msg);
    }
    
//    @Override
//    public void log(String msg) {
//        this.msg =  msg;
//        msg = header +ts+": "+msg + footer;
//        logger.log(msg);
//    }
    
}
