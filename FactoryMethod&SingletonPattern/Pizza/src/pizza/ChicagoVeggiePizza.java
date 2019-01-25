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
public class ChicagoVeggiePizza extends Pizza{
    final String NAME = "Chicago Veggie Pizza";
    final String DOUGH = "Thick Crust";
    final String SAUCE = "Marinara Sauce";
    final String TOPPINGS[] = {"Shredded Mozarella","Grated Parmesan","Diced Onions","Sliced mushrooms","Slice red pepper","Sliced black olives"};
    
    
    public ChicagoVeggiePizza(){
        
    }

    
    @Override
    public void prepare(){
        System.out.println("Preparing " + this.NAME);
    }
    
    @Override
    public void bake(){
        System.out.println("Baking " + this.NAME);
    }
    
    @Override
    public void cut(){
        System.out.println("Cutting " + this.NAME);
    }
    
    @Override
    public void box(){
        System.out.println("Boxing " + this.NAME);
    }

    public String getNAME() {
        return NAME;
    }

    public String getDOUGH() {
        return DOUGH;
    }

    public String getSAUCE() {
        return SAUCE;
    }

    public String[] getTOPPINGS() {
        return TOPPINGS;
    }
    
   public void print(){
       System.out.println("We ordered a "+this.NAME);
       System.out.println("---- "+this.NAME+" ----");
       System.out.println(this.DOUGH);
       System.out.println(this.SAUCE);
       for(int i=0; i<this.TOPPINGS.length;i++){
           System.out.println(TOPPINGS[i]);
       }
   }
}
