/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author Sholiha
 */
public class Driver {
    
    public static void main(String [] args){
        //SimplePizzaFactory spf = new SimplePizzaFactory();
        PizzaStore nyps = new NYPizzaStore();
        
        Pizza pizza = nyps.orderPizza("cheese");
        System.out.println("Leha ordered a "+pizza.getname()+"\n");
        
        pizza = nyps.orderPizza("cheese");
        System.out.println("Leha ordered a "+pizza.getname()+"\n");
    }
}
