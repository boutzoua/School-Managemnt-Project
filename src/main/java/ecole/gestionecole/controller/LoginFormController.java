package ecole.gestionecole.controller;

import ecole.gestionecole.HelloApplication;
import ecole.gestionecole.dbController.LoginController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginFormController implements Initializable {
    @FXML
    private AnchorPane login;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField pwdField;
    @FXML
    private Button Login;

    LoginController log = new LoginController();
    @FXML
    public void Login(){
        String username= usernameField.getText();
        String password= pwdField.getText();

        if (username.isEmpty() || password.isEmpty()){
            Alert alert= new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login");
            alert.setHeaderText(null);
            alert.setContentText("Username AND Password Required...!");
            alert.showAndWait();
        }else {
            if (username.startsWith("admin")){
                try {
                    if (log.Login(username,password)){
                        AnchorPane user = FXMLLoader.load(HelloApplication.class.getResource(("MainDashboard.fxml")));
                        login.getChildren().setAll(user);

                    }else {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Login");
                        alert.setHeaderText(null);
                        alert.setContentText("Invalid Username or Password..!");
                        alert.showAndWait();
                    }
                }catch (SQLException e){
                    e.printStackTrace();
                }catch (ClassNotFoundException e){
                    e.printStackTrace();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }else if (username.startsWith("teacher")){
                try {
                    if (log.Login(username,password)){
                        System.out.println("ALLLLLLLLLLLL RIght Teaaacher");
                    }else {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Login");
                        alert.setHeaderText(null);
                        alert.setContentText("Invalid Username or Password..!");
                        alert.showAndWait();
                    }
                }catch (SQLException e){
                    e.printStackTrace();
                }catch (ClassNotFoundException e){
                    e.printStackTrace();
                }
            }else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Login");
                alert.setHeaderText(null);
                alert.setContentText("Invalid Username or Password..!");
                alert.showAndWait();
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
