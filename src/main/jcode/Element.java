package main.jcode;

public interface Element {

  void paint();

  abstract class Button implements Element {

    protected String text;

    public Button(String text) {
      this.text = text;
    }
  }

  abstract class Checkbox implements Element {

    protected String label;

    public Checkbox(String label) {
      this.label = label;
    }
  }

  abstract class ProgressBar implements Element {

    protected int value;

    public ProgressBar(int value) {
      this.value = value;
    }
  }

  class WinLightButton extends Button {

    public WinLightButton(String text) {
      super(text);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a light square Windows Button with text '" + this.text + "'.");
    }
  }

  class WinLightCheckbox extends Checkbox {

    public WinLightCheckbox(String label) {
      super(label);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a light Windows Checkbox with label '" + this.label + "'.");
    }
  }

  class WinLightProgressBar extends ProgressBar {

    public WinLightProgressBar(int value) {
      super(value);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a light Windows progress bar with value " + this.value + ".");
    }
  }

  class WinDarkButton extends Button {

    public WinDarkButton(String text) {
      super(text);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a dark square Windows Button with text '" + this.text + "'.");
    }
  }

  class WinDarkCheckbox extends Checkbox {

    public WinDarkCheckbox(String label) {
      super(label);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a dark Windows Checkbox with label '" + this.label + "'.");
    }
  }

  class WinDarkProgressBar extends ProgressBar {

    public WinDarkProgressBar(int value) {
      super(value);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a dark Windows progress bar with value " + this.value + ".");
    }
  }

  class MacLightButton extends Button {

    public MacLightButton(String text) {
      super(text);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a light round Mac Button with text '" + this.text + "'.");
    }
  }

  class MacLightCheckbox extends Checkbox {

    public MacLightCheckbox(String label) {
      super(label);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a light Mac Checkbox with label '" + this.label + "'.");
    }
  }

  class MacLightProgressBar extends ProgressBar {

    public MacLightProgressBar(int value) {
      super(value);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a light Mac progress bar with value " + this.value + ".");
    }
  }

  class MacDarkButton extends Button {

    public MacDarkButton(String text) {
      super(text);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a dark round Mac Button with text '" + this.text + "'.");
    }
  }

  class MacDarkCheckbox extends Checkbox {

    public MacDarkCheckbox(String label) {
      super(label);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a dark Mac Checkbox with label '" + this.label + "'.");
    }
  }

  class MacDarkProgressBar extends ProgressBar {

    public MacDarkProgressBar(int value) {
      super(value);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a dark Mac progress bar with value " + this.value + ".");
    }
  }

  class LinuxLightButton extends Button {

    public LinuxLightButton(String text) {
      super(text);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a light Linux Button with text '" + this.text + "'.");
    }
  }

  class LinuxLightCheckbox extends Checkbox {

    public LinuxLightCheckbox(String label) {
      super(label);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a light Linux Checkbox with label '" + this.label + "'.");
    }
  }

  class LinuxLightProgressBar extends ProgressBar {

    public LinuxLightProgressBar(int value) {
      super(value);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a light Linux progress bar with value " + this.value + ".");
    }
  }

  class LinuxDarkButton extends Button {

    public LinuxDarkButton(String text) {
      super(text);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a dark Linux Button with text '" + this.text + "'.");
    }
  }

  class LinuxDarkCheckbox extends Checkbox {

    public LinuxDarkCheckbox(String label) {
      super(label);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a dark Linux Checkbox with label '" + this.label + "'.");
    }
  }

  class LinuxDarkProgressBar extends ProgressBar {

    public LinuxDarkProgressBar(int value) {
      super(value);
    }

    @Override
    public void paint() {
      System.out.println("Rendering a dark Linux progress bar with value " + this.value + ".");
    }
  }
}
