package main.jcode;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GUIApp {

  private static Application configureApplication() throws IOException {
    Application app;
    GUIFactory factory;

    Properties prop = new Properties();
    String propFileName = "config.properties";

    try (InputStream input = new FileInputStream(propFileName)) {
      prop.load(input);

      String theme = prop.getProperty("os.theme");
      String osName = prop.getProperty("os.name");

      if (theme == null) {
        throw new RuntimeException(
            "Theme was not found, please define os.theme in config.properties");
      }

      if (osName == null) {
        throw new RuntimeException(
            "OS name was not found, please define os.name in config.properties");
      }

      if (osName.contains("mac")) {
        if (theme.equals("light")) {
          factory = GUIFactory.MacLightGUIFactory.getInstance();
        } else if (theme.equals("dark")) {
          factory = GUIFactory.MacDarkGUIFactory.getInstance();
        } else {
          throw new RuntimeException("Unrecognized theme: " + theme);
        }
      } else if (osName.contains("win")) {
        if (theme.equals("light")) {
          factory = GUIFactory.WinLightGUIFactory.getInstance();
        } else if (theme.equals("dark")) {
          factory = GUIFactory.WinDarkGUIFactory.getInstance();
        } else {
          throw new RuntimeException("Unrecognized theme: " + theme);
        }
      } else if (osName.contains("linux")) {
        if (theme.equals("light")) {
          factory = GUIFactory.LinuxLightGUIFactory.getInstance();
        } else if (theme.equals("dark")) {
          factory = GUIFactory.LinuxDarkGUIFactory.getInstance();
        } else {
          throw new RuntimeException("Unrecognized theme: " + theme);
        }
      } else {
        throw new RuntimeException("Unrecognized OS: " + osName);
      }

      app = new Application(factory);
      return app;
    }
  }

  public static void main(String[] args) throws IOException {
    Application app = configureApplication();
    app.prepareWindow("Cool window", 2, 3, 1);
    app.paint();
  }
}
