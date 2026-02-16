package abstract_factory_prototype;

import abstract_factory_prototype.Element.Button;
import abstract_factory_prototype.Element.Checkbox;
import abstract_factory_prototype.Element.ProgressBar;

public class Application {

    private Button button;
    private Checkbox checkbox;
    private ProgressBar progressBar;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
        this.progressBar = factory.createProgressBar();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
        progressBar.paint();
    }
}
