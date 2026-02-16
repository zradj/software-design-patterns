package factory;

public class Drone implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivered by drone");
    }
}
