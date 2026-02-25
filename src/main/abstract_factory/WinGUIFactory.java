package main.abstract_factory;

public class WinGUIFactory extends GUIFactory {

  @Override
  public Button createButton() {
    return new WinButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WinCheckbox();
  }
}
