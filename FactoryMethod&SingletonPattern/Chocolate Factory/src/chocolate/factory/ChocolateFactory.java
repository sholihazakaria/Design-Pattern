/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolate.factory;

/**
 *
 * @author Sholiha
 */
public class ChocolateFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChocolateBoiler cb = ChocolateBoiler.getInstance();
        System.out.println("CB1 "+ cb.fill());
        System.out.println("CB1 "+ cb.boil());
        ChocolateBoiler cb2 = ChocolateBoiler.getInstance();
        System.out.println("CB2 "+ cb2.fill());
        System.out.println("CB1 "+ cb.drain());
        
        
        
        
        
        System.out.println("CB2 "+ cb2.boil());
        
        System.out.println("CB2 "+ cb2.drain());
        
    }
    
}
