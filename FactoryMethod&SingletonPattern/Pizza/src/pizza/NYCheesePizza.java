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
public class NYCheesePizza extends Pizza{
    public NYCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Cryst Dough";
        Sauce = "Marinara Sauce";
        
        toppings.add("Grated Reggiano Cheese");
    }
    
    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
    
}
