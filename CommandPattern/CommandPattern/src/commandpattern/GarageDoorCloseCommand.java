/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

/**
 *
 * @author Sholiha
 */
public class GarageDoorCloseCommand implements Command{

    GarageDoor garage;
    
    public GarageDoorCloseCommand(GarageDoor garage){
        this.garage = garage;
    }
    
    @Override
    public void execute() {
        garage.down();
    }

    @Override
    public void undo() {
        garage.up();
    }
    
}
