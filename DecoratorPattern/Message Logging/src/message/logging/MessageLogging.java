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
public class MessageLogging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoggerFactory factory = new LoggerFactory();
//        Logger logger = factory.getLogger();
//        logger = new EncryptLogger(logger);
//        logger.log("How are you?");
        
        Logger logger2 = factory.getLogger();
        logger2 = new EncryptLogger(new HTMLLogger(logger2));
        logger2.log("Goob Bye");
        
    }
    
}
