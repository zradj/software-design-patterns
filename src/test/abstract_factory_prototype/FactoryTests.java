package test.abstract_factory_prototype;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import main.abstract_factory_prototype.Element;
import main.abstract_factory_prototype.GUIFactory;
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
