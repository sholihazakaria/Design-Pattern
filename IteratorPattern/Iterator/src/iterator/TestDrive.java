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
public class TestDrive {
    public static void main(String[]args){
        PancakeHouseMenu pancake = new PancakeHouseMenu();
        DinerMenu diner = new DinerMenu();
        
        Waitress waitress = new Waitress(pancake, diner);
        
        waitress.printmenu();
    }
}
