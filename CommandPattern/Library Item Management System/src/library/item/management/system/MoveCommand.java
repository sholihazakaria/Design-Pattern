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
public class MoveCommand implements CommandInterface{

    Item item;
    String fromcategory;
    String tocategory;
    
    public MoveCommand(Item item, String fromcategory, String tocategory){
        this.item = item;
        this.fromcategory = fromcategory;
        this.tocategory = tocategory;
    }

    @Override
    public void execute() {
        item.move(fromcategory,tocategory);
    }
    
    
}

