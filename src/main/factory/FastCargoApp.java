package main.factory;

public class FastCargoApp {

  public void shipGoods(Delivery delivery) {
    Transport transport = delivery.createTransport();
    transport.deliver();
  }

  public static void main(String[] args) {
    FastCargoApp cargoApp = new FastCargoApp();

    cargoApp.shipGoods(new DroneDelivery());
    cargoApp.shipGoods(new ShipDelivery());
    cargoApp.shipGoods(new TruckDelivery());
  }
}
