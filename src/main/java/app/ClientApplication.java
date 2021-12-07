package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class ClientApplication extends Application {

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load((getClass().getResource("/fxml/menu.fxml")));
            stage.setTitle("TheHunter Call of the Hunter™");
            stage.setScene(new Scene(root, 700, 700));
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

    public static void ClientApplication(String[] args) {
        launch(args);
    }
}
