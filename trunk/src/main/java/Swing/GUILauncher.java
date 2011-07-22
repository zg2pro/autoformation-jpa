package main.java.Swing;

import java.sql.SQLException;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class GUILauncher extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        try {
			show(new GUI(this));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of DesktopApplication2
     */
    public static GUILauncher getApplication() {
        return Application.getInstance(GUILauncher.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(GUILauncher.class, args);
    }
}
