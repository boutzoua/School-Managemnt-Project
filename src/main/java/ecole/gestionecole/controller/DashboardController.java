package ecole.gestionecole.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @Override
        public void initialize(URL location, ResourceBundle resources){

    }
    @FXML
    private AnchorPane root;
    @FXML
    private ImageView ExamMgmt;
    @FXML
    private ImageView LibraryMgmt;
    @FXML
    private ImageView EventMgmt;
    @FXML
    private ImageView StudentMgmt;
    @FXML
    private JFXButton btnStudentMgmt;
    @FXML
    private JFXButton btnExamMgmt;
    @FXML
    private JFXButton btnLibraryMgmt;
    @FXML
    private JFXButton btnEventMgmt;
    @FXML
    private JFXButton btnUserSettings;
    @FXML
    private TextField username;

    @FXML
    void btnEventMgmt(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("School Management System");
        alert.setHeaderText(null);
        alert.setContentText("Sorry..! This feature currently Unavailable for this Version.");
        alert.showAndWait();
    }
    @FXML
    void btnExamMgmt(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("School Management System");
        alert.setHeaderText(null);
        alert.setContentText("Sorry..! This feature currently Unavailable for this Version.");
        alert.showAndWait();
    }
    @FXML
    void btnLibraryMgmt(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("School Management System");
        alert.setHeaderText(null);
        alert.setContentText("Sorry..! This feature currently Unavailable for this Version.");
        alert.showAndWait();
    }
    @FXML
    void setBtnStudentMgmt(ActionEvent event)throws IOException {
        System.out.println("student Managmnt");
    }
    @FXML
    void  setBtnUserSettings(ActionEvent event){
        System.out.println("setting user : User2");
    }
}
