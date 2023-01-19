package ecole.gestionecole.controller;

import com.jfoenix.controls.JFXButton;
import ecole.gestionecole.HelloApplication;
import ecole.gestionecole.dbController.ExamController;
import ecole.gestionecole.model.Exam;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManageExamController implements Initializable {
    @Override
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
    private JFXButton searchbymodule;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnUpdate;


    @FXML
    private JFXButton btnPrint;

    @FXML
    private JFXButton Back;
    @FXML
    private AnchorPane manageStudents;

    @FXML
    void Back(ActionEvent event) {
        try {
            AnchorPane studentMgmt = FXMLLoader.load(HelloApplication.class.getResource(("ExamManagement.fxml")));
            manageStudents.getChildren().setAll(studentMgmt);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @FXML
    void btnDelete(ActionEvent event) {
        try {

            String module = module1.getText();
            String field = field1.getText();
            String grade = grade1.getText();
            String date = date1.getText();
            String time = time1.getText();
            String salle = salle1.getText();
            String responsible = responsible1.getText();


            Exam exam = new Exam(module, field, grade, date, time, salle, responsible);
            int d = ExamController.deleteExam(module);


            if (d > 0) {

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

    } catch(ClassNotFoundException | SQLException ex) {
        Logger.getLogger(ExamController.class.getName()).log(Level.SEVERE, null, ex);
    }

}


    @FXML
    void btnPrint(ActionEvent event){

    }
    @FXML
    void btnUpdate(ActionEvent event){
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
                int d = ExamController.updateExam(exam);
                int i = ExamController.updateExam(exam);


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
        } catch (ClassNotFoundException | SQLException  ex) {
            Logger.getLogger(ExamController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    //Search Method
    @FXML
    void searchByModule(ActionEvent event) {
        try {
            String module = module1.getText();
            Exam e = ExamController.searchExambyModule(module);
            if (e != null) {
                module1.setText(String.valueOf(e.getModule()));
                field1.setText(e.getField());
                grade1.setText(e.getGrade());
                date1.setText(e.getDate());
                time1.setText(e.getTime());
                salle1.setText(e.getSalle());
                responsible1.setText(e.getResponsible());




            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Exam Search");
                alert.setHeaderText(null);
                alert.setContentText("Exam Not Found");
                alert.showAndWait();

                module1.setText(null);
                field1.setText(null);
                grade1.setText(null);
                date1.setText(null);
                time1.setText(null);
                salle1.setText(null);
                responsible1.setText(null);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ExamController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
