package main.abstract_factory_prototype;

import main.abstract_factory_prototype.Element.Button;
import main.abstract_factory_prototype.Element.Checkbox;
import main.abstract_factory_prototype.Element.ProgressBar;

public class Application {

    private Button button;
    private Checkbox checkbox;
    private ProgressBar progressBar;

    public Application(GUIFactory factory) {
        this.button = factory.createButton("Button");
        this.checkbox = factory.createCheckbox("Checkbox");
        this.progressBar = factory.createProgressBar(0);
    }

    public void paint() {
        button.paint();
        checkbox.paint();
        progressBar.paint();
    }
}
