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
public class CeilingfanOnCommand implements Command{

    CeilingFan fan;
    
    public CeilingfanOnCommand(CeilingFan fan){
        this.fan = fan;
    }
    
    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
    
}
