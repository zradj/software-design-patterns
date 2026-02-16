package abstract_factory;

public class MacCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Mac checkbox rendered");
    }
}
