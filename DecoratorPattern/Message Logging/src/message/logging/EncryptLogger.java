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
public class EncryptLogger extends LoggerDecorator{

    //Timestamp ts = new Timestamp(System.currentTimeMillis());
    Logger logger;
    String msg;
    
   public EncryptLogger(Logger logger){
       this.logger = logger;
   }

    @Override
    public void log(String msg) {
        this.msg = msg;
        String newmsg = msg.charAt(msg.length() - 1) + msg.substring(0, msg.length() - 1);
        logger.log(newmsg);
    }
   
//    @Override
//    public void log(String msg) {
//        this.msg = msg;
//        msg = ts +": "+msg;
//        String newmsg = msg.charAt(msg.length() - 1) + msg.substring(0, msg.length() - 1);
//        logger.log(newmsg);
//    }
   
    
}
