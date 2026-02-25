package main.facade;

import java.util.ArrayList;
import java.util.List;

public class Cart {

  private final List<String> items = new ArrayList<>();

  public void addItem(String itemId) {
    items.add(itemId);
  }

  public List<String> getItems() {
    return items;
  }
}
