package abstract_factory_prototype;

import static abstract_factory_prototype.Element.*;

import abstract_factory_prototype.Element.Button;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();

    ProgressBar createProgressBar();

    class WinLightGUIFactory implements GUIFactory {

        @Override
        public Button createButton() {
            return new WinLightButton();
        }

        @Override
        public Checkbox createCheckbox() {
            return new WinLightCheckbox();
        }

        @Override
        public ProgressBar createProgressBar() {
            return new WinLightProgressBar();
        }
    }

    class WinDarkGUIFactory implements GUIFactory {

        @Override
        public Button createButton() {
            return new WinDarkButton();
        }

        @Override
        public Checkbox createCheckbox() {
            return new WinDarkCheckbox();
        }

        @Override
        public ProgressBar createProgressBar() {
            return new WinDarkProgressBar();
        }
    }

    class MacLightGUIFactory implements GUIFactory {

        @Override
        public Button createButton() {
            return new MacLightButton();
        }

        @Override
        public Checkbox createCheckbox() {
            return new MacLightCheckbox();
        }

        @Override
        public ProgressBar createProgressBar() {
            return new MacLightProgressBar();
        }
    }

    class MacDarkGUIFactory implements GUIFactory {

        @Override
        public Button createButton() {
            return new MacDarkButton();
        }

        @Override
        public Checkbox createCheckbox() {
            return new MacDarkCheckbox();
        }

        @Override
        public ProgressBar createProgressBar() {
            return new MacDarkProgressBar();
        }
    }

    class LinuxLightGUIFactory implements GUIFactory {

        @Override
        public Button createButton() {
            return new LinuxLightButton();
        }

        @Override
        public Checkbox createCheckbox() {
            return new LinuxLightCheckbox();
        }

        @Override
        public ProgressBar createProgressBar() {
            return new LinuxLightProgressBar();
        }
    }

    class LinuxDarkGUIFactory implements GUIFactory {

        @Override
        public Button createButton() {
            return new LinuxDarkButton();
        }

        @Override
        public Checkbox createCheckbox() {
            return new LinuxDarkCheckbox();
        }

        @Override
        public ProgressBar createProgressBar() {
            return new LinuxDarkProgressBar();
        }
    }
}