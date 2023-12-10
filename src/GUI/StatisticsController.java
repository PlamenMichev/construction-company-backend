package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StatisticsController
{

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML private Button ok;

    public void switchToIndex(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Index.fxml")));
        stage = (Stage)(ok.getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
