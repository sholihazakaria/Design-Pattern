/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.item.management.system;

import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author Sholiha
 */
public class Item {

    String itemName;
    HashMap<String,ArrayList> itemInDB = new HashMap();
    
    public Item(String itemName) {
        this.itemName = itemName;
    }
    
    public synchronized void add(String category){
        ArrayList<String> list;
        if(itemInDB.containsKey(itemName)){
            list = itemInDB.get(itemName);
            list.add(category);
            itemInDB.put(itemName, list);
        }
        else{
            list = new ArrayList();
            list.add(category);
            itemInDB.put(itemName, list);
        }
        System.out.println("Item "+itemName+" has been added to the "+category+ " category");
    }
    
    public void delete(String category){
        ArrayList<String> list;
        list = itemInDB.get(itemName);
        list.remove(category);
        itemInDB.put(itemName, list);
        
        System.out.println("Item "+itemName+" has been deleted from the "+category+ " category");
    }
    
    public void move(String category, String category2){
        System.out.println("Move the item from the "+category+" category to "+category2+ " category");
        delete(category);
        add(category2);
    }
    
    public void print(String item){
        System.out.println("Item "+item +" belongs to these categories: "+itemInDB.get(item));
    }
    
    public String getItemName(){
        return itemName;
    }
}
