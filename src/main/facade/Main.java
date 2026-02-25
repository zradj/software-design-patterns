package main.facade;

import java.util.UUID;

public class Main {

  public static void main(String[] args){
    User user = new User();
    Cart cart = new Cart();

    for (int i = 0; i < 5; i++)
      cart.addItem(UUID.randomUUID().toString());

    CheckoutFacade.placeOrder(cart, user);
  }
}
