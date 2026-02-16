package abstract_factory_prototype;

import abstract_factory_prototype.Element.*;

public class Window implements Element {

    private String title;
    private Button[] buttons;
    private Checkbox[] checkboxes;
    private ProgressBar[] progressBars;

    public Window(String title, Button[] buttons,
                  Checkbox[] checkboxes, ProgressBar[] progressBars) {
        this.title = title;
        this.buttons = buttons;
        this.checkboxes = checkboxes;
        this.progressBars = progressBars;
    }

    @Override
    public void paint() {
        System.out.println("Rendering the windows titled '" + this.title + "'...");

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
}
