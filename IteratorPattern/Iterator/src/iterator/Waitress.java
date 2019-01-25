/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;
import java.util.Iterator;

/**
 *
 * @author Sholiha
 */
public class Waitress {

    Menu pancakehousemenu;
    Menu dinermenu;
    
    public Waitress(Menu pancake, Menu diner){
        this.dinermenu = diner;
        this.pancakehousemenu = pancake;
    }
    
    public void printmenu(){
        Iterator<MenuItem> pancakeIterator = pancakehousemenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinermenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printmenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printmenu(dinerIterator);
        
    }
    
    public void printmenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice()+ " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
        
    
}
