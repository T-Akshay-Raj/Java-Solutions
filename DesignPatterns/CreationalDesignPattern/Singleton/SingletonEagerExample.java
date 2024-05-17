package DesignPatterns.CreationalDesignPattern.Singleton;

public class SingletonEagerExample {
  private static SingletonEagerExample instance = new SingletonEagerExample();
  private SingletonEagerExample() {
  }
  public static SingletonEagerExample getInstance() {
    return instance;
  }
}
