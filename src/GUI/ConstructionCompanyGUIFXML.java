package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The main class of the GUI
 * @author Group 2
 * @version 1.0
 */
public class ConstructionCompanyGUIFXML extends Application
{
  public void start(Stage window) throws IOException
  {
    window.setTitle("Bob's company");
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("index.fxml"));
    Scene scene = new Scene(loader.load());
    window.setScene(scene);
    window.show();
  }
}
