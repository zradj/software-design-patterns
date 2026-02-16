package abstract_factory_prototype;

import static abstract_factory_prototype.Element.*;

import abstract_factory_prototype.Element.Button;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();

    class WinFactory implements GUIFactory {

        @Override
        public Button createButton() {
            return new WinButton();
        }

        @Override
        public Checkbox createCheckbox() {
            return new WinCheckbox();
        }
    }

    class MacFactory implements GUIFactory {

        @Override
        public Button createButton() {
            return new MacButton();
        }

        @Override
        public Checkbox createCheckbox() {
            return new MacCheckbox();
        }
    }
}