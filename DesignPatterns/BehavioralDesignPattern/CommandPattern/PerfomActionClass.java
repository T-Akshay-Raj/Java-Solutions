package DesignPatterns.BehavioralDesignPattern.CommandPattern;

public class PerfomActionClass {
private static Light light = new Light();
  public static void main(String[] args) {
Command lightOn = new LightOnCommand(light);
    Command lightOff = new LightOffCommand(light);
    ActionClass actionClass = new ActionClass("Light");
    actionClass.performAction(lightOn);
    actionClass.performAction(lightOff);
  }

}
