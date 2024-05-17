package DesignPatterns.BehavioralDesignPattern.CommandPattern;

public class LightOffCommand
    implements Command {
  public LightOffCommand(
      Light light) {
    this.light = light;
  }

  private Light light;
  @Override
  public void execute() {
    light.turnOff();
  }
}
