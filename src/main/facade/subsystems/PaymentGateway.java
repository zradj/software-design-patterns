package main.facade.subsystems;

import java.util.UUID;

public class PaymentGateway {

  public static String processCreditCard(String cardNum) {
    String paymentId = UUID.randomUUID().toString();
    System.out.println(
        "Credit card with number " + cardNum + " processed (payment id: " + paymentId + ")");
    return paymentId;
  }
}
