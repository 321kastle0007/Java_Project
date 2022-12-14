package com.example.mp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.example.mp.HelloController.setUsername;

public class LoginController extends NullPointerException{

    @FXML
    private PasswordField password;
    @FXML
    private TextField username;

    @FXML
    private Label errorPassword;

    @FXML
    private Label errorUsername;


    private Parent root;
    private Stage stage;
    private Scene scene;

    public void onLoginButtonClick(ActionEvent event) throws IOException {
        if (!username.getText().isBlank() && !password.getText().isBlank()){
            validateLogin(event);
        }
        else {
            if (username.getText().isBlank()){
                errorUsername.setText("⚠ Please enter username!");
                username.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
            }
            else{
                errorUsername.setText("");
                username.setStyle("");
            }
            if (password.getText().isBlank()){
                errorPassword.setText("⚠ Please enter password!");
                password.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
            }
            else {
                errorPassword.setText("");
                password.setStyle("");
            }
        }

    }

    private void validateLogin(ActionEvent event) {
        DatabaseConnector connectnow = new DatabaseConnector();
        Connection connectdb = connectnow.getConnection();
        String verifylogin = "select count(1) from educator.user_details where Username = '" + username.getText() + "' and Password  = '" + password.getText() + "'";

        Statement statement = null;
        try {
            statement = connectdb.createStatement();
            ResultSet queryResult = statement.executeQuery(verifylogin);
            while(queryResult.next()){
                if (queryResult.getInt(1)==1){
                    try {
                        String u = (username.getText());
                        root = FXMLLoader.load(getClass().getResource("Home.fxml")); //pass scene name here
                        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                        System.out.println(u);
                        setUsername(String.valueOf(u));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                else {
                    errorUsername.setText("");
                    username.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
                    username.setText("");
                    errorPassword.setText("⚠ Invalid User!");
                    password.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
                    password.setText("");
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void switchToSignUp(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("SignUp.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToHome(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Home.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}