package test.jcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.jcode.GUIFactory;
import main.jcode.Window;
import main.jcode.WindowBuilder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BuilderTests {

    @ParameterizedTest(
            name = "WindowBuilder creates Window with {0} buttons, {1} checkboxes, and {2} progress bars",
            quoteTextArguments = false
    )
    @CsvSource(textBlock = """
            0, 1, 1
            1, 2, 3
            50, 42, 11
            100, 101, 1
            """)
    void testWindowBuilderNumComponents(int numButtons, int numCheckboxes, int numProgressBars) {
        GUIFactory factory = GUIFactory.LinuxLightGUIFactory.getInstance();
        WindowBuilder builder = new WindowBuilder(factory);

        for (int i = 1; i <= numButtons; i++) {
            builder.addButton("Button " + i);
        }

        for (int i = 1; i <= numCheckboxes; i++) {
            builder.addCheckbox("Checkbox " + i);
        }

        for (int i = 1; i <= numProgressBars; i++) {
            builder.addProgressBar(0);
        }

        Window window = builder.build();

        assertEquals(numButtons, window.getButtons().size(),
                "WindowBuilder should create a Window with " + numButtons + " buttons");
        assertEquals(numCheckboxes, window.getCheckboxes().size(),
                "WindowBuilder should create a Window with " + numCheckboxes + " checkboxes");
        assertEquals(numProgressBars, window.getProgressBars().size(),
                "WindowBuilder should create a Window with " + numProgressBars + " progress bars");
    }
}
