package DesignPatterns.CreationalDesignPattern.Singleton;

//Lazy Initialization
public class SingletonLazyExample {
  private static SingletonLazyExample instance;

  private SingletonLazyExample() {
    if (instance != null) {
      throw new IllegalStateException("Instance already created");
    }
  }

  public static SingletonLazyExample getInstance() {
    if (instance == null) {
      synchronized (SingletonLazyExample.class) {
        if (instance == null) {
          instance = new SingletonLazyExample();
        }
      }
    }
    return instance;
  }
}