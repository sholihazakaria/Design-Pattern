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
public class CommandTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Question 2
//        ItemManager im = new ItemManager();
//        Category cd = new Category("CD");
//        Item duet = new Item("Duet");
//        
//        AddCommand addDuet = new AddCommand(duet, cd.getcategoryName());
//        im.setCommand(addDuet);
//        im.addItem();
//        
//        Category newrelease = new Category("New Releases");
//        AddCommand addDuetToNR = new AddCommand(duet, newrelease.getcategoryName());
//        im.setCommand(addDuetToNR);
//        im.addItem();
//        
//        PrintCommand print = new PrintCommand(duet);
//        im.setCommand(print);
//        im.printCategory();
//        
//        DeleteCommand delete = new DeleteCommand(duet, newrelease.getcategoryName());
//        im.setCommand(delete);
//        im.deleteItem();
//        
//        im.setCommand(print);
//        im.printCategory();
        
        
        //Question 3 (with move)
        ItemManager manager = new ItemManager();
        Item a = new Item("A Beautiful Mind");
        Category cd = new Category("CD");
        
        AddCommand add = new AddCommand(a, cd.getcategoryName());
        manager.setCommand(add);
        manager.addItem();
        
        PrintCommand print = new PrintCommand(a);
        manager.setCommand(print);
        manager.printCategory();
        
        Category book = new Category("Book");
        MoveCommand move = new MoveCommand(a, cd.getcategoryName(), book.getcategoryName());
        manager.setCommand(move);
        manager.moveItem();
        
        manager.setCommand(print);
        manager.printCategory();
    }
    
}
