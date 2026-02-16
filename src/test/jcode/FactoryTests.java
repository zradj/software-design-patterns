package test.jcode;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import main.jcode.Element;
import main.jcode.GUIFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FactoryTests {

    @Test
    @DisplayName("WinDarkGUIFactory creates an instance of WinDarkButton")
    void testFactoryCreate() {
        GUIFactory factory = GUIFactory.WinDarkGUIFactory.getInstance();
        Element.Button button = factory.createButton("button");
        assertInstanceOf(Element.WinDarkButton.class, button,
                "The object should be an instance of WinDarkButton");
    }
}
