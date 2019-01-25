/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Sholiha
 */
public class SingletonClient {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Singleton s = Singleton.getInstance();
        System.out.println(s.getDescription());
    }
}
