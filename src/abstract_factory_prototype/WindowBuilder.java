package abstract_factory_prototype;

import abstract_factory_prototype.Element.*;

public class WindowBuilder {

    private GUIFactory factory;
    private String title;
    private Button[] buttons = new Button[] {};
    private Checkbox[] checkboxes = new Checkbox[] {};
    private ProgressBar[] progressBars = new ProgressBar[] {};

    public WindowBuilder(GUIFactory factory) {
        this.factory = factory;
    }

    public void addTitle(String title) {
        this.title = title;
    }

    public void addButton() {

    }
}
