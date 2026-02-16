package main.abstract_factory_prototype;

import static main.abstract_factory_prototype.Element.*;

import main.abstract_factory_prototype.Element.Button;

public interface GUIFactory {

    Button createButton(String text);

    Checkbox createCheckbox(String label);

    ProgressBar createProgressBar(int value);

    class WinLightGUIFactory implements GUIFactory {

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
    }

    class WinDarkGUIFactory implements GUIFactory {

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
    }

    class MacLightGUIFactory implements GUIFactory {

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
    }

    class MacDarkGUIFactory implements GUIFactory {

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
    }

    class LinuxLightGUIFactory implements GUIFactory {

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
    }

    class LinuxDarkGUIFactory implements GUIFactory {

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
    }
}