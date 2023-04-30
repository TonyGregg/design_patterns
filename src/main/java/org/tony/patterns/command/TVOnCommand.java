package org.tony.patterns.command;

/**
 * Created on Sun, 4/30/23 at 9:21 AM by Genil.
 */
public class TVOnCommand  implements Command {
  private final TV tv;

  public TVOnCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.turnOn();
  }

  @Override
  public void undo() {
    tv.turnOff();
  }

}
