package com.example.laboratoriofinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMainMenu(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("main-menu-view.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root, 1440, 710);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToStudentsScene(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("estudiantes-view.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root, 1440, 710);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToMonitorsScene(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("monitor-view.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root, 1440, 710);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPrestamosScene(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("prestamo-view.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root, 1440, 710);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToInventarioScene(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("inventario-view.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root, 1440, 710);
        stage.setScene(scene);
        stage.show();
    }
}
