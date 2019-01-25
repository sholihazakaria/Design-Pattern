/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzz.coffee;

/**
 *
 * @author course009
 */
public class StarbuzzCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Beverage beverage = new Espresso();
        beverage.setSize("TALL");
        beverage = new Milk(beverage);
        System.out.println(beverage.getSize()  + " " + beverage.getDescription() + " $" + beverage.cost());
        
        Beverage beverage2 = new DarkRoast();
        beverage2.setSize("GRANDE");
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getSize() + " "+ beverage2.getDescription() + " $" + beverage2.cost());
        
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize("VENTI");
        beverage3 = new SoyMilk(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getSize()  + " " + beverage3.getDescription() + " $" + beverage3.cost());
    }
    
}
