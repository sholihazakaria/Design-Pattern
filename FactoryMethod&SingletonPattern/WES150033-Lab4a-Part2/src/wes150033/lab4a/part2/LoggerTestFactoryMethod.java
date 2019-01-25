/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wes150033.lab4a.part2;

import java.util.Scanner;

/**
 *
 * @author Sholiha
 */
public class LoggerTestFactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner userscanner = new Scanner(System.in);
        LoggerFactory k = new LoggerFactory();
        Logger logger = k.getLogger();
        System.out.println("Enter message: ");
        String message = userscanner.nextLine();
        logger.log(message);
        
    }
    
}
