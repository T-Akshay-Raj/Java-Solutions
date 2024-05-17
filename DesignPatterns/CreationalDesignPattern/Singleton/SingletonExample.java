package DesignPatterns.CreationalDesignPattern.Singleton;

public class SingletonExample {
  private static SingletonExample instance = null;

  private SingletonExample() {
  }

  public static SingletonExample getInstance() {
    if (instance == null) {
      instance = new SingletonExample();
    }
    return instance;
  }

  public void printMessage() {
    System.out.println("Singleton Example");
  }
}

