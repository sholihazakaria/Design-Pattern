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
public class Singleton {
    private static Singleton unInstance;
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        if(unInstance == null){
            unInstance = new Singleton();
        }
        return unInstance;
    }
    
    public static String getDescription(){
        return "k";
    }
}
