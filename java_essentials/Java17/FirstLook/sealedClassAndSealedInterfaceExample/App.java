package java_essentials.Java17.FirstLook.sealedClassAndSealedInterfaceExample;

public class App {

  public static void enjoyConsumable(Consumable consumable) {
    switch (consumable) {
      case Coffee c -> c.addCream();
      case Tea t -> t.stir();
      default -> System.out.println("It's ready to go");
    }
    consumable.consume();
  }

  public static void main(String[] args) {
    Coffee coffee = new Coffee();
    Tea tea = new Tea();
    Beverage bev = new Beverage();

    enjoyConsumable(coffee);//Add cream to coffee      Consume beverage
    enjoyConsumable(tea);//Stir tea       Consume beverage
    enjoyConsumable(bev);//It's ready to go       Consume beverage
  }
}
