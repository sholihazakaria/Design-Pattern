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
public class AddCommand implements CommandInterface{

    Item item;
    String category;
    public AddCommand(Item item, String category){
        this.item = item;
        this.category = category;
    }

    @Override
    public void execute() {
        item.add(category);
    }
    
    
}
