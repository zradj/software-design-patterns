package main.facade.subsystems;

public class InventorySystem {

  public static boolean checkStock(String itemId) {
    // we have infinite stocks of everything
    System.out.println("Found item with id " + itemId + " in the stock");
    return true;
  }

  public static void reserveItem(String itemId) {
    System.out.println("Item with id " + itemId + " reserved");
  }
}
