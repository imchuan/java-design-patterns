package com.jdp.command;

/**
 * @author Leon
 */
public class SimpleRemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        
        Light light = new Light();
        Command command = new LightOnCommand(light);

        simpleRemoteControl.setCommand(command);
        simpleRemoteControl.buttonWasPressed();
    }
}
