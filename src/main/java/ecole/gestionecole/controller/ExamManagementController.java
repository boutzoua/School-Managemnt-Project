package ecole.gestionecole.controller;

import com.jfoenix.controls.JFXButton;
import ecole.gestionecole.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ExamManagementController {

    @FXML
    private AnchorPane ExamManagement;

    @FXML
    private JFXButton btnExamRegister;

    @FXML
    private JFXButton btnExamManage;

    @FXML
    private JFXButton btnPrintExam;

    @FXML
    private JFXButton Back;

    @FXML
    void Back(ActionEvent event) {
        try {
            AnchorPane studentMgmt = FXMLLoader.load(HelloApplication.class.getResource(("MainDashboard.fxml")));
            ExamManagement.getChildren().setAll(studentMgmt);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    @FXML
    void btnPrintExam(ActionEvent event) {

    }

    @FXML
    void btnExamManage(ActionEvent event) {
        try {
            AnchorPane studentMgmt = FXMLLoader.load(HelloApplication.class.getResource(("ManageExam.fxml")));
            ExamManagement.getChildren().setAll(studentMgmt);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    @FXML
    void btnExamRegister(ActionEvent event) {
        try {
            AnchorPane studentMgmt = FXMLLoader.load(HelloApplication.class.getResource(("RegisterExam.fxml")));
            ExamManagement.getChildren().setAll(studentMgmt);
        }catch(IOException e){
            System.out.println(e);
        }
    }


}
