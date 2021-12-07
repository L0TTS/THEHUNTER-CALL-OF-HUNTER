package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class instructionController {
    @FXML
    public Button instructionBack;
    @FXML
    public Text descriptionGame;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;

    @FXML
    public void onClickMethodGame(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent root = fxmlLoader.load(getClass().getResourceAsStream("/fxml/menu.fxml"));
            stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            InputStream iconStream = getClass().getResourceAsStream("/img/Maintitleicon.jpg");
            Image image = new Image(iconStream);
            stage.getIcons().add(image);
            String css = this.getClass().getResource("/css/menu.css").toExternalForm();
            stage.getScene().getStylesheets().add(css);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
