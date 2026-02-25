package main.facade.subsystems;

public class NotificationService {

  public static void emailReceipt(String email, String paymentId, String trackingId) {
    System.out.println("Receipt emailed to email " + email + ":");
    System.out.println("\tPayment id: " + paymentId);
    System.out.println("\tTracking id: " + trackingId);
  }
}
