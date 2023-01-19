package ecole.gestionecole.controller;

import com.jfoenix.controls.JFXButton;
import ecole.gestionecole.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentManagementController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources){

    }
    @FXML
    private ImageView StaffMgmt;

    @FXML
    private ImageView StudentMgmt;

    @FXML
    private JFXButton btnStudentReg;

    @FXML
    private JFXButton btnStudentMnge;

    @FXML
    private JFXButton btnPrintStudents;

    @FXML
    private AnchorPane manageStudents;

    @FXML
    private JFXButton Back;

    @FXML
    void Back() {
        try {
            AnchorPane studentMgmt = FXMLLoader.load(HelloApplication.class.getResource(("MainDashboard.fxml")));
            manageStudents.getChildren().setAll(studentMgmt);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    @FXML
    void SetBtnStudentReg(ActionEvent event) {
        try {
            AnchorPane studentMgmt = FXMLLoader.load(HelloApplication.class.getResource(("RegisterStudent.fxml")));
            manageStudents.getChildren().setAll(studentMgmt);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    @FXML
    void setBtnStudentMnge(ActionEvent event) {
        try {
            AnchorPane studentMgmt = FXMLLoader.load(HelloApplication.class.getResource(("ManageStudents.fxml")));
            manageStudents.getChildren().setAll(studentMgmt);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    @FXML
    void btnPrintStudents(ActionEvent event) {
        try {
            AnchorPane studentMgmt = FXMLLoader.load(HelloApplication.class.getResource(("PrintStudents.fxml")));
            manageStudents.getChildren().setAll(studentMgmt);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    @FXML
    void transfer(ActionEvent event) {
        try {
            AnchorPane studentMgmt = FXMLLoader.load(HelloApplication.class.getResource(("TransferStudents.fxml")));
            manageStudents.getChildren().setAll(studentMgmt);
        }catch(IOException e){
            System.out.println(e);
        }
    }

}

