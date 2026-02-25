package main.facade.subsystems;

import main.facade.Cart;

import java.util.UUID;

public class ShippingService {

  public static void calculateLogistics(Cart cart) {
    System.out.println("Logistics calculated");
  }

  public static String createTrackingId(Cart cart) {
    return UUID.randomUUID().toString();
  }
}
