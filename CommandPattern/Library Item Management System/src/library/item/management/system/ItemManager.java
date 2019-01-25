/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.item.management.system;


/**
 *
 * @author Sholiha
 */
//like remote control
public class ItemManager {
    CommandInterface command;
    
    public ItemManager(){}
    
    public void addItem(){
        command.execute();
    }
    
    public void deleteItem(){
        command.execute();
    }
    
    public void moveItem(){
        command.execute();
    }
    public void setCommand(CommandInterface command){
        this.command = command;
    }
    
    public void printCategory(){
        command.execute();
    }
    
    
    
}
