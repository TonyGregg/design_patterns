package org.tony.patterns.command;

/**
 * Created on Sun, 4/30/23 at 9:10 AM by Genil.
 */
public class LightOnCommand implements Command {
  private final Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOn();
  }

  @Override
  public void undo() {
    light.turnOff();
  }

}
