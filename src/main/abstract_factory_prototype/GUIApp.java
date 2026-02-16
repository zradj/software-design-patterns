package main.abstract_factory_prototype;

public class GUIApp {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        // let's pretend we have some functionality to detect the system theme
        String theme = "light";

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            if (theme.equals("light")) {
                factory = new GUIFactory.MacLightGUIFactory();
            } else if (theme.equals("dark")) {
                factory = new GUIFactory.MacDarkGUIFactory();
            } else {
                throw new RuntimeException("Unrecognized theme: " + theme);
            }
        } else if (osName.contains("win")) {
            if (theme.equals("light")) {
                factory = new GUIFactory.WinLightGUIFactory();
            } else if (theme.equals("dark")) {
                factory = new GUIFactory.WinDarkGUIFactory();
            } else {
                throw new RuntimeException("Unrecognized theme: " + theme);
            }
        } else if (osName.contains("linux")) {
            if (theme.equals("light")) {
                factory = new GUIFactory.LinuxLightGUIFactory();
            } else if (theme.equals("dark")) {
                factory = new GUIFactory.LinuxDarkGUIFactory();
            } else {
                throw new RuntimeException("Unrecognized theme: " + theme);
            }
        } else {
            throw new RuntimeException("Unrecognized OS: " + osName);
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
