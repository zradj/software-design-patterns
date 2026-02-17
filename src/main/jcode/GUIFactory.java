package main.jcode;

import static main.jcode.Element.*;

import main.jcode.Element.Button;

public interface GUIFactory {

  Button createButton(String text);

  Checkbox createCheckbox(String label);

  ProgressBar createProgressBar(int value);

  class WinLightGUIFactory implements GUIFactory {

    private WinLightGUIFactory() {}

    private static class InstanceHolder {
      private static final WinLightGUIFactory INSTANCE = new WinLightGUIFactory();
    }

    @Override
    public Button createButton(String text) {
      return new WinLightButton(text);
    }

    @Override
    public Checkbox createCheckbox(String label) {
      return new WinLightCheckbox(label);
    }

    @Override
    public ProgressBar createProgressBar(int value) {
      return new WinLightProgressBar(value);
    }

    public static WinLightGUIFactory getInstance() {
      return InstanceHolder.INSTANCE;
    }
  }

  class WinDarkGUIFactory implements GUIFactory {

    private WinDarkGUIFactory() {}

    private static class InstanceHolder {
      private static final WinDarkGUIFactory INSTANCE = new WinDarkGUIFactory();
    }

    @Override
    public Button createButton(String text) {
      return new WinDarkButton(text);
    }

    @Override
    public Checkbox createCheckbox(String label) {
      return new WinDarkCheckbox(label);
    }

    @Override
    public ProgressBar createProgressBar(int value) {
      return new WinDarkProgressBar(value);
    }

    public static WinDarkGUIFactory getInstance() {
      return InstanceHolder.INSTANCE;
    }
  }

  class MacLightGUIFactory implements GUIFactory {

    private MacLightGUIFactory() {}

    private static class InstanceHolder {
      private static final MacLightGUIFactory INSTANCE = new MacLightGUIFactory();
    }

    @Override
    public Button createButton(String text) {
      return new MacLightButton(text);
    }

    @Override
    public Checkbox createCheckbox(String label) {
      return new MacLightCheckbox(label);
    }

    @Override
    public ProgressBar createProgressBar(int value) {
      return new MacLightProgressBar(value);
    }

    public static MacLightGUIFactory getInstance() {
      return InstanceHolder.INSTANCE;
    }
  }

  class MacDarkGUIFactory implements GUIFactory {

    private MacDarkGUIFactory() {}

    private static class InstanceHolder {
      private static final MacDarkGUIFactory INSTANCE = new MacDarkGUIFactory();
    }

    @Override
    public Button createButton(String text) {
      return new MacDarkButton(text);
    }

    @Override
    public Checkbox createCheckbox(String label) {
      return new MacDarkCheckbox(label);
    }

    @Override
    public ProgressBar createProgressBar(int value) {
      return new MacDarkProgressBar(value);
    }

    public static MacDarkGUIFactory getInstance() {
      return InstanceHolder.INSTANCE;
    }
  }

  class LinuxLightGUIFactory implements GUIFactory {

    private LinuxLightGUIFactory() {}

    private static class InstanceHolder {
      private static final LinuxLightGUIFactory INSTANCE = new LinuxLightGUIFactory();
    }

    @Override
    public Button createButton(String text) {
      return new LinuxLightButton(text);
    }

    @Override
    public Checkbox createCheckbox(String label) {
      return new LinuxLightCheckbox(label);
    }

    @Override
    public ProgressBar createProgressBar(int value) {
      return new LinuxLightProgressBar(value);
    }

    public static LinuxLightGUIFactory getInstance() {
      return InstanceHolder.INSTANCE;
    }
  }

  class LinuxDarkGUIFactory implements GUIFactory {

    private LinuxDarkGUIFactory() {}

    private static class InstanceHolder {
      private static final LinuxDarkGUIFactory INSTANCE = new LinuxDarkGUIFactory();
    }

    @Override
    public Button createButton(String text) {
      return new LinuxDarkButton(text);
    }

    @Override
    public Checkbox createCheckbox(String label) {
      return new LinuxDarkCheckbox(label);
    }

    @Override
    public ProgressBar createProgressBar(int value) {
      return new LinuxDarkProgressBar(value);
    }

    public static LinuxDarkGUIFactory getInstance() {
      return InstanceHolder.INSTANCE;
    }
  }
}
