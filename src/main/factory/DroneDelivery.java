package main.factory;

public class DroneDelivery extends Delivery {

  @Override
  public Transport createTransport() {
    return new Drone();
  }
}
