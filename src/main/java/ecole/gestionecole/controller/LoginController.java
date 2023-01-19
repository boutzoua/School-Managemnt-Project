package ecole.gestionecole.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources){
    }
    @FXML
    private AnchorPane login;
    @FXML
    private TextField usernameField;
    @FXML
    private  TextField pwdField;
    @FXML
    private Button Login;
    @FXML
    private void setBtnLogin(){

    }

}
