package abstract_factory;

public class WinButton implements Button {

    @Override
    public void render() {
        System.out.println("Windows button rendered");
    }
}
