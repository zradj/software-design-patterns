package abstract_factory_prototype;

import abstract_factory_prototype.Element.*;

import java.util.ArrayList;
import java.util.List;

public class WindowBuilder {

    private final GUIFactory factory;
    private String title;
    private final List<Button> buttons = new ArrayList<>();
    private final List<Checkbox> checkboxes = new ArrayList<>();
    private final List<ProgressBar> progressBars = new ArrayList<>();

    public WindowBuilder(GUIFactory factory) {
        this.factory = factory;
    }

    public void addTitle(String title) {
        this.title = title;
    }

    public void addButton(String text) {
        this.buttons.add(this.factory.createButton(text));
    }

    public void addCheckbox(String label) {
        this.checkboxes.add(this.factory.createCheckbox(label));
    }

    public void addProgressBar(int initialValue) {
        this.progressBars.add(this.factory.createProgressBar(initialValue));
    }

    public Window build() {
        return new Window(this.title, this.buttons, this.checkboxes, this.progressBars);
    }
}
