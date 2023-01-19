package ecole.gestionecole;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @FXML
    private AnchorPane rootLayer;
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        rootLayer=(AnchorPane)fxmlLoader.load();
        Scene scene = new Scene(rootLayer);
        primaryStage.setTitle("Gestion d'Ecole ENSA MARRAKECH");
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream(("/ecole/gestionecole/other/img/logo.png"))));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}