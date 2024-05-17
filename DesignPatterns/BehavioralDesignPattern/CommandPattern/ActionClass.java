package DesignPatterns.BehavioralDesignPattern.CommandPattern;

public class ActionClass {
  String action;

  public ActionClass(String action) {
    this.action = action;
  }

  public void performAction(Command command) {
    command.execute();
  }
}
