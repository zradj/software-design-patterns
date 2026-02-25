package main.facade;

import main.facade.subsystems.InventorySystem;
import main.facade.subsystems.NotificationService;
import main.facade.subsystems.PaymentGateway;
import main.facade.subsystems.ShippingService;

public class CheckoutFacade {

  public static void placeOrder(Cart cart, User user) {
    for (String itemId : cart.getItems()) {
      if (!InventorySystem.checkStock(itemId)) {
        System.out.println("oops");
        continue;
      }

      InventorySystem.reserveItem(itemId);
    }

    String paymentId = PaymentGateway.processCreditCard(user.getCreditCardNum());

    ShippingService.calculateLogistics(cart);
    String trackingId = ShippingService.createTrackingId(cart);

    NotificationService.emailReceipt(user.getEmail(), paymentId, trackingId);
  }
}
