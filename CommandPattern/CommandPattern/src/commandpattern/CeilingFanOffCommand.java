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
public class CeilingFanOffCommand implements Command{

    CeilingFan fan;
    int prevSpeed;
    
    public CeilingFanOffCommand(CeilingFan fan){
        this.fan = fan;
    }
    
    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.off();
    }

    @Override
    public void undo() {
        if(prevSpeed == fan.HIGH){
            fan.high();
        }else if(prevSpeed == fan.MEDIUM){
            fan.medium();
        }else if(prevSpeed == fan.LOW){
            fan.low();
        }else if(prevSpeed == fan.OFF){
            fan.off();
        }
    }
    
}
