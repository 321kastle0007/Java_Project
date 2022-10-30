package com.example.mp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.*;
import static com.example.mp.HelloController.setUsername;

public class SignUpController extends NullPointerException{

    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private TextField Fname;

    @FXML
    private TextField Lname;

    @FXML
    private PasswordField confirmP;

    @FXML
    private TextField email;

    @FXML
    private Label errorEmail;

    @FXML
    private Label errorLname;

    @FXML
    private Label errorName;

    @FXML
    private Label errorPassword;

    @FXML
    private Label errorPhoneNo;

    @FXML
    private Label errorUsername;

    @FXML
    private TextField password;

    @FXML
    private TextField phone;

    @FXML
    private TextField username;

    public void onSignUpButtonClick(ActionEvent event) throws IOException {
        System.out.println("Button clicked!");
        if (!Fname.getText().isBlank() && !Lname.getText().isBlank() && !username.getText().isBlank() && !password.getText().isBlank()
                && !email.getText().isBlank() && !phone.getText().isBlank() )
        {validateSignUp(event);}
        else {
            if(Fname.getText().isBlank() || Lname.getText().isBlank()){
                errorName.setText("⚠ Please enter full name!");
                Fname.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
                Lname.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
            }
            else {
                errorName.setText(null);
                Fname.setStyle(null);
                Lname.setStyle(null);
            }
            if(username.getText().isBlank()){
                errorUsername.setText("⚠ Please enter username!");
                username.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
            }
            else {
                errorUsername.setText(null);
                username.setStyle(null);
            }
            if(password.getText().isBlank()){
                errorPassword.setText("⚠ Please enter password!");
                password.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
            }
            else {
                errorPassword.setText(null);
                password.setStyle(null);
            }
            if(email.getText().isBlank()){
                errorEmail.setText("⚠ Please enter email-id!");
                email.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
            }
            else {
                errorEmail.setText(null);
                email.setStyle(null);
            }
            if(phone.getText().isBlank()){
                errorPhoneNo.setText("⚠ Please enter your mobile no!");
                phone.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
            }
            else {
                errorPhoneNo.setText(null);
                phone.setStyle(null);
            }

        }
    }

    private void validateSignUp(ActionEvent event) {
        System.out.println("Inside function signup");
        DatabaseConnector connectnow = new DatabaseConnector();
        Connection connectdb = connectnow.getConnection();
        String verifySignup = "select count(1) from educator.user_details where Username = '" + username.getText() +"' ";
        Statement statement = null;
        try{
            statement=connectdb.createStatement();
            ResultSet queryResult = statement.executeQuery(verifySignup);
            while(queryResult.next()){
                System.out.println("Inside while loop");
                if(queryResult.getInt(1)==1){
                    System.out.println("inside if");
                    username.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 15px");
                    errorUsername.setText("⚠ This username already exists");
                }
                else {
                    System.out.println("inside else");
                    String insertDetails = "INSERT INTO user_details (`F_Name`, `L_Name`, `Username`, `Password`, `Email_ID`, `Mobile_No`)  VALUES ('"+Fname.getText()+"','"+Lname.getText()+"','"+username.getText()+"','"+password.getText()+"','"+email.getText()+"','"+phone.getText()+"'\n)";
                    try {
                        statement = connectdb.createStatement();
                        int a = statement.executeUpdate(insertDetails);
                        if (a == 1 ) {
                            System.out.println("Inserted data!");
                        }
                        else{
                            System.out.println("Failed to insert data");
                        }
                        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml")); //pass scene name here
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }catch (Exception e){
                        e.printStackTrace();
                        e.getCause();
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void switchToLogin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml")); //pass scene name here
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}

