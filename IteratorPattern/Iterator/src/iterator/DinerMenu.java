/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author Sholiha
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    
    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        
        addItem("Vegetarian BLT", 
                "(Fakin') Bacon with lettuce and tomato on whole wheat", true, 2.99);
        
        addItem("BLT", 
                "Bacon with lettuce and tomato on whole wheat", false, 2.99);
        
        addItem("Soup of the day", 
                "Soup of the day, with a side of potato salad", false, 3.29);
        
        addItem("Hotdog", 
                "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }
    
    public void addItem(String name, String description, boolean vege, double price){
        MenuItem menuItem = new MenuItem(name, description, vege, price);
        if(numberOfItems >= MAX_ITEMS){
            System.err.println("Sorry, menu is full! Can't add item to menu");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    
    @Override
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
