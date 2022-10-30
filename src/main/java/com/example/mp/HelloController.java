package com.example.mp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    private Parent root;
    private Stage stage;
    private Scene scene;

    public static String Username = null;
    public static String getUsername() {
        return Username;
    }

    public static void setUsername(String username) {
        Username = username;
        System.out.println(username);
    }

    String username = getUsername();


    public void switchToLogin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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

    public void switchToExp11(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp11.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void switchToExp12(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp12.fxml")); //pass scene name here
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

    public void switchToPage4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Page4.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToFibreOptics(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("FibreOptics.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp21(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp21.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp22(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp22.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp23(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp23.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp24(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp24.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp31(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp31.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp32(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp32.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp33(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp33.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp34(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp34.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp41(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp41.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp42(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp42.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp43(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp43.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp44(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp44.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToNanotechnology(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Nanotechnology.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp45(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp45.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp35(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp35.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToExp36(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Exp36.fxml")); //pass scene name here
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    //------methods-------------



}