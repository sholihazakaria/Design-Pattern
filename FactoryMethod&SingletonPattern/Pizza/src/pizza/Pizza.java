/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.ArrayList;

/**
 *
 * @author Sholiha
 */
public abstract class Pizza {
    String name;
    String dough;
    String Sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding Sauce...");
        System.out.println("Adding Topping: ");
        for(String topping : toppings){
            System.out.println("    "+topping);
        }
    }
    
    public void bake(){
        System.out.println("Bake for 25 minute at 350F");
    }
    
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
    
    public String getname(){
        return name;
    }
}
