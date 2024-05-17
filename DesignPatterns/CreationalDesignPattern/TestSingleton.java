package DesignPatterns.CreationalDesignPattern;

import DesignPatterns.CreationalDesignPattern.Singleton.SingletonExample;

public class TestSingleton extends Thread {
  public static void main(String[] args) {

    //Test Singleton using multithreading
    TestSingleton t1 = new TestSingleton();
    TestSingleton t2 = new TestSingleton();
    t1.start();
    t2.start();
  }

  @Override
  public void run() {
    SingletonExample singletonExample = SingletonExample.getInstance();
    singletonExample.printMessage();
  }
}

