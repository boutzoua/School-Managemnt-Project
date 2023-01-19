package ecole.gestionecole.controller;

import com.jfoenix.controls.JFXButton;
import ecole.gestionecole.HelloApplication;
import ecole.gestionecole.dbController.ExamController;
import ecole.gestionecole.model.Exam;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterExamController {

    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private TextField module1;

    @FXML
    private TextField field1;

    @FXML
    private TextField grade1;

    @FXML
    private TextField date1;

    @FXML
    private TextField time1;

    @FXML
    private TextField salle1;

    @FXML
    private TextField responsible1;

    @FXML
    private JFXButton btnRegister;
    @FXML
    private JFXButton btnReset;

    @FXML
    private JFXButton Back;

    @FXML
    private AnchorPane manageStudents;

    @FXML
    void Back(ActionEvent event) {
        try {
            AnchorPane examMgmt = FXMLLoader.load(HelloApplication.class.getResource(("ExamManagement.fxml")));
            manageStudents.getChildren().setAll(examMgmt);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @FXML
    void btnRegister(ActionEvent event) {

        try {
            ValidationController v = new ValidationController();
            if (v.validateDate(date1)) {


                String module = module1.getText();
                String field = field1.getText();
                String grade = grade1.getText();
                String date = date1.getText();
                String time = time1.getText();
                String salle = salle1.getText();
                String responsible = responsible1.getText();


                Exam exam = new Exam(module, field, grade,date,time,salle,responsible);
                int i = ExamController.addExam(exam);


                if (i > 0) {

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Exam Management");
                    alert.setHeaderText(null);
                    alert.setContentText("Exam Updated Successfully..!");
                    alert.showAndWait();

                    module1.setText(null);
                    field1.setText(null);
                    grade1.setText(null);
                    date1.setText(null);
                    time1.setText(null);
                    salle1.setText(null);
                    responsible1.setText(null);

                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Exam Management");
                    alert.setHeaderText(null);
                    alert.setContentText("OOPs there is an error updating Exam..!");
                    alert.showAndWait();
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ExamController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void btnReset(ActionEvent event) {

        module1.setText(null);
        field1.setText(null);
        grade1.setText(null);
        date1.setText(null);
        time1.setText(null);
        salle1.setText(null);
        responsible1.setText(null);
    }
}
