/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Sholiha
 */
public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> menuItems;
    
    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();
        
        addItem("KGB's Pancake Breakfast", 
                "Pancakes with scrambled eggs and toast", true, 2.99);
        
        addItem("Regular Pancake Breakfast", 
                "Pancakes with fried eggs and sausage", false, 2.99);
        
        addItem("Blueberry Pancakes", 
                "Pancakes made with fresh blueberries", true, 3.49);
        
        addItem("Waffles", 
                "Waffles with your choice of blueberries or strwaberries", true, 3.59);
    }
    
    public void addItem(String name, String description, boolean vege, double price){
        MenuItem menuItem = new MenuItem(name, description, vege, price);
        menuItems.add(menuItem);
    }
    
    @Override
    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
