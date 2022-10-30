package com.example.mp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.*;
import java.lang.Math.*;

//import static jdk.internal.agent.Agent.getText;

public class Page4Controller extends NullPointerException {

    @FXML
    private TextField Length;
    
    @FXML
    private TextField Order;
    
    @FXML
    private TextField Distance;
    
    @FXML
    private Label errorOrder;

    @FXML
    private Label errorLength;

    @FXML
    private Label errorDistance;

    @FXML
    private TextField Wavelength;

    @FXML
    private TextField d;

    public void onCalculateButtonClick(ActionEvent event) {

        if (!Length.getText().isBlank() && !Order.getText().isBlank() && !Distance.getText().isBlank()) {
            CalculateFormula(event);
        }
        else if (Order.getText().isBlank() && Length.getText().isBlank() && Distance.getText().isBlank()) {
            errorOrder.setText("⚠ Please enter Order");
            errorLength.setText("⚠ Please enter Length");
            errorDistance.setText("⚠ Please enter Distance");
            Wavelength.setText("");
            Order.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 90px");
            Distance.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 90px");
            Length.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 90px");
        }
        else if(Order.getText().isBlank() && Length.getText().isBlank() && !Distance.getText().isBlank()){
            errorOrder.setText("⚠ Please enter Order");
            errorLength.setText("");
            errorDistance.setText("⚠ Please enter Distance");
            Wavelength.setText("");
            Order.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 90px");
            Distance.setStyle(null);
            Length.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 90px");
        }
        else if(Order.getText().isBlank() && !Length.getText().isBlank() && Distance.getText().isBlank()){
            errorOrder.setText("⚠ Please enter Order");
            errorLength.setText("⚠ Please enter Length");
            errorDistance.setText("");
            Wavelength.setText("");
            Order.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 90px");
            Distance.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 90px");
            Length.setStyle(null);
        }
        else if(!Order.getText().isBlank() && Length.getText().isBlank() && Distance.getText().isBlank()){
            errorOrder.setText("");
            errorLength.setText("⚠ Please enter Length");
            errorDistance.setText("⚠ Please enter Distance");
            Wavelength.setText("");
            Order.setStyle(null);
            Distance.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 90px");
            Length.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 90px");
        }
        else if(Order.getText().isBlank() && !Length.getText().isBlank() && !Distance.getText().isBlank()){
            errorOrder.setText("⚠ Please enter Order");
            errorLength.setText("");
            errorDistance.setText("");
            Wavelength.setText("");
            Order.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 90px");
            Distance.setStyle(null);
            Length.setStyle(null);
        }
        else if(!Order.getText().isBlank() && !Length.getText().isBlank() && Distance.getText().isBlank()){
            errorOrder.setText("");
            errorLength.setText("⚠ Please enter rate of Length");
            errorDistance.setText("");
            Wavelength.setText("");
            Order.setStyle(null);
            Distance.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 90px");
            Length.setStyle(null);
        }
        else if(!Order.getText().isBlank() && Length.getText().isBlank() && !Distance.getText().isBlank()){
            errorOrder.setText("");
            errorLength.setText("");
            errorDistance.setText("⚠ Please enter Distance");
            Wavelength.setText("");
            Order.setStyle(null);
            Distance.setStyle(null);
            Length.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-border-radius: 90px");
        }


    }
    public void CalculateFormula(ActionEvent event){
        float theta,sine,Wave;

        double p = Double.parseDouble(Order.getText());

        double t =  Double.parseDouble(Length.getText());

        double r = Double.parseDouble(Distance.getText());

        double m = Double.parseDouble(d.getText());

        r=r/2;
        theta = (float) Math.atan(t/r);
        sine= (float) Math.sin(theta);
        Wave =(float) ((m*sine)/p);


        Wavelength.setText(String.valueOf(Wave));
        Order.setStyle(null);
        Length.setStyle(null);
        Distance.setStyle(null);
        d.setStyle(null);
        errorOrder.setText("");
        errorLength.setText("");
        errorDistance.setText("");
    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Page1.fxml")); //pass scene name here
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

    public void switchToExp13(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp13.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }




}
