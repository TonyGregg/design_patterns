package org.tony.patterns.command;

/**
 * Created on Sun, 4/30/23 at 9:13 AM by Genil.
 */
public class RemoteControl {
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
  }

  public void pressUndo() {
    command.undo();
  }

}
