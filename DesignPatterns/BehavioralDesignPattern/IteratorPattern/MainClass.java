package DesignPatterns.BehavioralDesignPattern.IteratorPattern;

public class MainClass {
  public static void main(String[] args) {
    Item item1 = new Item("Apple", 1.0f, 10);
    Item item2 = new Item("Banana", 0.5f, 20);
    Item item3 = new Item("Orange", 2.0f, 5);
    Item item4 = new Item("Grapes", 1.5f, 15);
    Item item5 = new Item("Pineapple", 3.0f, 0);


    Inventory inventory = new Inventory(item1, item2, item3, item4, item5);


    StockIterator stockIterator = inventory.iterator();
    while (stockIterator.hasNext()) {
      Item item = stockIterator.next();
      System.out.println(
          "Item: " + item.getName() + ", Price: " + item.getPrice() +
              ", Quantity: " + item.getQuantity());
    }
  }
}
