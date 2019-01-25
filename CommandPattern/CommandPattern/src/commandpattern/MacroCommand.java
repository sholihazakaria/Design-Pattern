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
public class MacroCommand implements Command{
    Command [] command;
    
    public MacroCommand(Command[] command){
        this.command = command;
    }
    
    @Override
    public void execute() {
        for(int i=0; i<command.length; i++){
            command[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i=0; i<command.length; i++){
            command[i].undo();
        }
    }
    
}
