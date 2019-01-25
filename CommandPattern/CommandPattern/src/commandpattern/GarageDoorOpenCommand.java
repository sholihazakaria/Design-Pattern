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
public class GarageDoorOpenCommand implements Command{

    GarageDoor garage;
    
    public GarageDoorOpenCommand(GarageDoor garage){
        this.garage = garage;
    }
    @Override
    public void execute() {
        garage.up();
    }

    @Override
    public void undo() {
        garage.down();
    }
    
}
