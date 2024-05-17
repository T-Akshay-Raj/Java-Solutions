package DesignPatterns.BehavioralDesignPattern.IteratorPattern;

import java.util.Iterator;
import java.util.function.Consumer;

public class Inventory implements Iterable{

  private Item[] items;

  public Inventory(Item... items) {
    this.items = items;
  }

  public Item[] getItems() {
    return items;
  }

  @Override
  public StockIterator iterator() {
    return new StockIterator(this, 0);
  }


}
