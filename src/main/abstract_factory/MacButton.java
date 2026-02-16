package main.abstract_factory;

public class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("Mac button rendered");
    }
}
