package main.abstract_factory_prototype;

import java.util.List;

public class Window implements Element {

    private final String title;
    private final List<Button> buttons;
    private final List<Checkbox> checkboxes;
    private final List<ProgressBar> progressBars;

    public Window(String title, List<Button> buttons,
                  List<Checkbox> checkboxes, List<ProgressBar> progressBars) {
        this.title = title;
        this.buttons = buttons;
        this.checkboxes = checkboxes;
        this.progressBars = progressBars;
    }

    @Override
    public void paint() {
        System.out.println("Rendering the window titled '" + this.title + "'...");

        for (Button button : this.buttons) {
            button.paint();
        }

        for (Checkbox checkbox : this.checkboxes) {
            checkbox.paint();
        }

        for (ProgressBar progressBar : this.progressBars) {
            progressBar.paint();
        }
    }

    public String getTitle() {
        return title;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public List<Checkbox> getCheckboxes() {
        return checkboxes;
    }

    public List<ProgressBar> getProgressBars() {
        return progressBars;
    }
}
