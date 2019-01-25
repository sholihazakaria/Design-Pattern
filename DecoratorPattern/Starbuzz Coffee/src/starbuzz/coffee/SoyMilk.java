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
public class SoyMilk extends CondimentDecorator{
    Beverage beverage;
   
    
    public SoyMilk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy Milk";
    }

    @Override
    public double cost() {
        if(beverage.getSize() == "TALL")
            return .15 + beverage.cost();
        else if (beverage.getSize() == "GRANDE")
            return  .20 + beverage.cost();
        else if (beverage.getSize() == "VENTI")
            return  .25 + beverage.cost();
        
        return  .15 + beverage.cost();
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }
}
