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
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class betaController {
    @FXML
    public Button gameBack;
    @FXML
    public Button pos3Atck;
    @FXML
    public Button pos2Atck;
    @FXML
    public Button pos1Atck;
    @FXML
    public Button pos4Atck;
    @FXML
    public Button pos5Atck;
    @FXML
    public Button pos6Atck;
    @FXML
    public Button pos1Def;
    @FXML
    public Button pos2Def;
    @FXML
    public Button pos3Def;
    @FXML
    public Button pos4Def;
    @FXML
    public Button pos5Def;
    @FXML
    public Button pos6Def;

    @FXML
    public void onClickBack(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent root = fxmlLoader.load(getClass().getResourceAsStream("/fxml/menu.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
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
