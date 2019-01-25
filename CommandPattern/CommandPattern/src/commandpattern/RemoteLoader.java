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
public class RemoteLoader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Simple remote
//        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
//        Light light = new Light();
//        GarageDoor garageDoor = new GarageDoor();
//        LightOnCommand lightOn = new LightOnCommand(light);
//        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
//        
//        remoteControl.setCommand(lightOn);
//        remoteControl.buttonWasPressed();
//        
//        remoteControl.setCommand(garageOpen);
//        remoteControl.buttonWasPressed();
        
        //RemoteControl remote = new RemoteControl();
        
//        Light livingRoomLight = new Light("Living Room");
//        Light kitchenLight = new Light("Kitchen");
//        CeilingFan ceilingfan = new CeilingFan("Living Room");
//        GarageDoor garageDoor = new GarageDoor("");
//        Stereo stereo = new Stereo("Living Room");
//        
//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//        
//        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
//        
//        CeilingfanOnCommand ceilingfanOn = new CeilingfanOnCommand(ceilingfan);
//        CeilingFanOffCommand ceilingfanOff = new CeilingFanOffCommand(ceilingfan);
//        
//        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
//        GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);
//        
//        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
//        
//        
//        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
//        remote.setCommand(2, ceilingfanOn, ceilingfanOff);
//        remote.setCommand(3, stereoOn, stereoOff);
//        remote.setCommand(4, garageOpen, garageClose);
        
        //remote without undo
        //System.out.println(remote);
        
//        remote.onButtonWasPushed(0);
//        remote.offButtonWasPushed(0);
//        remote.onButtonWasPushed(1);
//        remote.offButtonWasPushed(1);
//        remote.onButtonWasPushed(2);
//        remote.offButtonWasPushed(2);
//        remote.onButtonWasPushed(3);
//        remote.offButtonWasPushed(3);
//        remote.onButtonWasPushed(4);
//        remote.offButtonWasPushed(4);
        
        //remote with undo
//        remote.onButtonWasPushed(0);
//        remote.offButtonWasPushed(0);
//        System.out.println(remote);
//        remote.undoButtonWasPushed();
//        remote.offButtonWasPushed(0);
//        remote.onButtonWasPushed(0);
//        System.out.println(remote);
//        remote.undoButtonWasPushed();
        
        //remote with state
//        RemoteControl remote = new RemoteControl();
//        
//        CeilingFan fan = new CeilingFan("Living Room");
//        
//        CeilingFanMediumCommand fanmedium = new CeilingFanMediumCommand(fan);
//        CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(fan);
//        CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);
//        
//        remote.setCommand(0, fanmedium, fanOff);
//        remote.setCommand(1, fanHigh, fanOff);
//        
//        remote.onButtonWasPushed(0);
//        remote.offButtonWasPushed(0);
//        System.out.println(remote);
//        remote.undoButtonWasPushed();
//        
//        remote.onButtonWasPushed(1);
//        System.out.println(remote);
//        remote.undoButtonWasPushed();
        
        //Test Macro Command
        RemoteControl remote = new RemoteControl();
        
        Light light = new Light("Room");
        Stereo stereo = new Stereo("Hall");
        CeilingFan fan = new CeilingFan("Room");
        
        
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        CeilingFanHighCommand fanOn = new CeilingFanHighCommand(fan);
        
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);
        
        Command[] onCommand = {lightOn, stereoOn, fanOn};
        Command[] offCommand = {lightOff, stereoOff,fanOff};
        
        MacroCommand enterHouse = new MacroCommand(onCommand);
        MacroCommand exitHouse = new MacroCommand(offCommand);
        
        remote.setCommand(0, enterHouse, exitHouse);
        
        System.out.println(remote);
        System.out.println("---Pushing Macro On---");
        remote.onButtonWasPushed(0);
        System.out.println("---Pushing Macro Off---");
        remote.offButtonWasPushed(0);
        System.out.println("---Pushing Undo Button---");
        remote.undoButtonWasPushed();
    }
    
}
