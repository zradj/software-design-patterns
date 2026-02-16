package main.abstract_factory_prototype;

public class Application {

    private final WindowBuilder builder;
    private Window window;

    public Application(GUIFactory factory) {
        this.builder = new WindowBuilder(factory);
    }

    public void prepareWindow(String title, int numButtons,
                              int numCheckboxes, int numProgressBars) {
        this.builder.addTitle(title);

        for (int i = 1; i <= numButtons; i++) {
            this.builder.addButton("Button " + i);
        }

        for (int i = 1; i <= numCheckboxes; i++) {
            this.builder.addCheckbox("Checkbox " + i);
        }

        for (int i = 1; i <= numProgressBars; i++) {
            this.builder.addProgressBar(0);
        }

        this.window = this.builder.build();
    }

    public void paint() {
        this.window.paint();
    }
}
