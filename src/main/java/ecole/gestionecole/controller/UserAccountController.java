package ecole.gestionecole.controller;

import com.jfoenix.controls.JFXButton;
import ecole.gestionecole.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UserAccountController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resouces){

    }
    @FXML
    private AnchorPane userAccount;
    @FXML
    private JFXButton btnLogout;
    @FXML
    private JFXButton ManageUsers;
    @FXML JFXButton back;

    @FXML
    private void Back(){
        try {
            AnchorPane studentMgmt= FXMLLoader.load(HelloApplication.class.getResource(("MainDashboard.fxml")));
            userAccount.getChildren().setAll(studentMgmt);
        }catch (IOException e){
            System.out.println(e);
        }

    }
    @FXML
    private void ManageUsers(){
        try {
            AnchorPane studentMgmt = FXMLLoader.load(HelloApplication.class.getResource(("ManageUsers.fxml")));
            userAccount.getChildren().setAll(studentMgmt);
        }catch (IOException e ){
            System.out.println(e);
        }
    }
    @FXML
    private void btnLogout(){
        try {
            AnchorPane studentMgmt = FXMLLoader.load(HelloApplication.class.getResource(("login.fxml")));
            userAccount.getChildren().setAll(studentMgmt);

        }catch (IOException e){
            System.out.println(e);
        }
    }

}
