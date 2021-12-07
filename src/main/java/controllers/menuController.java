package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class menuController {
    @FXML
    public Button startGameButton;
    @FXML
    public Button Instruction;
    @FXML
    public Label mainTitle;

    private Stage stage;
    private Scene scene;

    @FXML
    public void onClickMethodGame(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent root = fxmlLoader.load(getClass().getResourceAsStream("/fxml/instruction.fxml"));
            stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            InputStream iconStream = getClass().getResourceAsStream("/img/Maintitleicon.jpg");
            Image image = new Image(iconStream);
            stage.getIcons().add(image);
            String css = this.getClass().getResource("/css/instruction.css").toExternalForm();
            stage.getScene().getStylesheets().add(css);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    public void onClickMethodGameStart(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent root = fxmlLoader.load(getClass().getResourceAsStream("/fxml/gameBeta.fxml"));
            stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            InputStream iconStream = getClass().getResourceAsStream("/img/Maintitleicon.jpg");
            Image image = new Image(iconStream);
            stage.getIcons().add(image);
            String css = this.getClass().getResource("/css/beta.css").toExternalForm();
            stage.getScene().getStylesheets().add(css);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
