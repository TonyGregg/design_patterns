package org.tony.patterns.command;

/**
 * Created on Sun, 4/30/23 at 9:14 AM by Genil.
 */
public class CommandTester {

  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();
    Light light = new Light();
    Command lightOnCommand = new LightOnCommand(light);
    remoteControl.setCommand(lightOnCommand);
    TV tv = new TV();
    Command tvOnCommand = new TVOnCommand(tv);


    remoteControl.pressButton();
    remoteControl.pressUndo();

    remoteControl.setCommand(tvOnCommand);
    remoteControl.pressButton();
    remoteControl.pressUndo();

  }

}
