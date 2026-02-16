package abstract_factory;

public class WinCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Windows checkbox rendered");
    }
}
