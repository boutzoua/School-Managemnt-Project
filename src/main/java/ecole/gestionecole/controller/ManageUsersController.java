package ecole.gestionecole.controller;

import com.jfoenix.controls.JFXButton;
import ecole.gestionecole.HelloApplication;
import ecole.gestionecole.dbController.UserController;
import ecole.gestionecole.model.User;
import ecole.gestionecole.tableModel.UserTableModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ManageUsersController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadTable();
    }


    private final  ObservableList<UserTableModel> data = FXCollections.observableArrayList();

    @FXML
    private TableView<UserTableModel> usersTable;



    @FXML
    private TableColumn<UserTableModel, String> UsernameColumn;

    @FXML
    private TableColumn<UserTableModel, String> passwordColumn;

    @FXML
    private JFXButton addUser;

    @FXML
    private TextField userNameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private JFXButton searchUser;

    @FXML
    private JFXButton updateUser;

    @FXML
    private JFXButton deleteUser;

    @FXML
    private JFXButton Back;

    @FXML
    private AnchorPane root;


    @FXML
    void Back() {
        try {
            AnchorPane user = FXMLLoader.load(HelloApplication.class.getResource(("UserAccount.fxml")));
            root.getChildren().setAll(user);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    @FXML
    void loadTable(){
        //Wrote this Method as Sepereate Because can use this for Table Refresh as well.

        UsernameColumn.setCellValueFactory(new PropertyValueFactory<UserTableModel, String>("Username"));
        passwordColumn.setCellValueFactory(new PropertyValueFactory<UserTableModel, String>("password"));



        try {
            usersTable.setItems(data);
            ArrayList<User> users = null;
            users = UserController.getAllUsers();

            for (User user : users) {
                UserTableModel ctm = new UserTableModel();
                ctm.setUsername(user.getUsername());
                ctm.setPassword(user.getPassword());
                data.add(ctm);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void addUser() {

        try {
            if(ValidationController.validateEmpty(userNameField) && ValidationController.validateEmpty(passwordField)) {

                String username = userNameField.getText();
                String password = passwordField.getText();

                User user = new User(username, password);
                int i = UserController.addUser(user);

                if(i > 0){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("User Management");
                    alert.setHeaderText(null);
                    alert.setContentText("User Registered Successfully..!");
                    alert.showAndWait();

                    userNameField.setText(null);
                    passwordField.setText(null);
                }
                data.clear();               //Refresh Table
                loadTable();                //Refresh Table

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void deleteUser(ActionEvent event) {
        String username = userNameField.getText();

        try {
            int deleteUser = UserController.deleteUser(username);

            if(deleteUser > 0){

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("User Management");
                alert.setHeaderText(null);
                alert.setContentText("User Deleted Sucessfully..!");
                alert.showAndWait();

                userNameField.setText(null);
                passwordField.setText(null);

                data.clear();               //Refresh Table
                loadTable();                //Refresh Table

            } else {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("User Management");
                alert.setHeaderText(null);
                alert.setContentText("There is an Error in Deleting User..!");
                alert.showAndWait();

                userNameField.setText(null);
                passwordField.setText(null);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void searchUser(ActionEvent event) {

        String username = userNameField.getText();

        try {
            User search = UserController.searchUser(username);

            if(search != null){

                userNameField.setText(search.getUsername());
                passwordField.setText(search.getPassword());

            }else {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("User Management");
                alert.setHeaderText(null);
                alert.setContentText("User Not Found");
                alert.showAndWait();

                userNameField.setText(null);
                passwordField.setText(null);

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void updateUser(ActionEvent event) {

        String username = userNameField.getText();
        String password = passwordField.getText();

        try {

            User user = new User(username,password);
            int update = UserController.updateUser(user);

            if(update > 0){

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("User Management");
                alert.setHeaderText(null);
                alert.setContentText("User Updated Successfully..!");
                alert.showAndWait();

                userNameField.setText(null);
                passwordField.setText(null);

                data.clear();
                loadTable();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
