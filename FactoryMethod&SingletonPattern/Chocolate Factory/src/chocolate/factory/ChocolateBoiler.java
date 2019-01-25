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
public class ChocolateBoiler {
    private static ChocolateBoiler chocoInstance;
    private boolean empty;
    private boolean boiled;
    
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    
    public String fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
            
        }
        return "Fill the boiler w/ milk and choc";
    }
    
    public String drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            
        }
        return "drain the boiled mixt";
    }
    
    public String boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
        return "boiling the mixture";
    }
    
    public boolean isEmpty(){
        return empty;
    }
    
    public boolean isBoiled(){
        return boiled;
    }
    
    public static synchronized ChocolateBoiler getInstance(){
        if(chocoInstance == null){
            chocoInstance = new ChocolateBoiler();
        }
        return chocoInstance;
    }
}
