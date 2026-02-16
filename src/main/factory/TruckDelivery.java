package main.factory;

public class TruckDelivery extends Delivery {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
