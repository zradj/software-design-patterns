package main.abstract_factory;

public class App {

  public static final String OS = System.getProperty("os.name");

  public static void main(String[] args) {
    GUIFactory guiFactory = null;

    if (OS.startsWith("Windows")) {
      guiFactory = new WinGUIFactory();
    } else if (OS.startsWith("Mac")) {
      guiFactory = new MacGUIFactory();
    }

    Button button = guiFactory.createButton();
    Checkbox checkbox = guiFactory.createCheckbox();

    button.render();
    checkbox.render();
  }
}
