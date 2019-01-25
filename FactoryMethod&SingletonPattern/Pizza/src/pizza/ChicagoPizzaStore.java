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
public class ChicagoPizzaStore extends PizzaStore{

    public ChicagoPizzaStore() {
        
    }
    
    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;
        
        if(type.equals("cheese")){
            pizza = new ChicagoCheesePizza();
        }else if(type.equals("pepperoni")){
            //pizza = new PepperoniPizza();
        }else if(type.equals("clam")){
           // pizza = new ClamPizza();
        }else if(type.equals("veggie")){
            pizza = new ChicagoVeggiePizza();
        }
        
        return pizza;
        
    }
}
