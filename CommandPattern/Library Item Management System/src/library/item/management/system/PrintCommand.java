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
public class PrintCommand implements CommandInterface{

    Item item;
    
    public PrintCommand(Item item){
        this.item = item;
    }
    
    @Override
    public void execute() {
        item.print(item.getItemName());
    }
    
}
