package factory;

public class ShipDelivery extends Delivery {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
