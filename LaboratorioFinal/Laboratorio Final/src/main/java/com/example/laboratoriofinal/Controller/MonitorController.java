package com.example.laboratoriofinal.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MonitorController {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    @FXML
    private Button estudiantesButton;
    @FXML
    private TextField cellphoneMonitor;

    @FXML
    private TextField emailMonitor;

    @FXML
    private TextField idMonitor;

    @FXML
    private Button inventarioButton;

    @FXML
    private Button monitorButton;

    @FXML
    private TextField nameMonitor;

    @FXML
    private Button prestamosButton;

    @FXML
    private Button saveButton;

    @FXML
    private Button searchButton;

    @FXML
    private VBox sideBarMenu;


    @FXML
    void switchToInventarioScene(ActionEvent event) throws IOException {
        mfc.switchToInventarioScene(event);
    }

    @FXML
    void switchToMonitorsScene(ActionEvent event) throws IOException {
        mfc.switchToMonitorsScene(event);

    }

    @FXML
    void switchToPrestamosScene(ActionEvent event) throws IOException {
        mfc.switchToPrestamosScene(event);

    }

    @FXML
    void switchToStudentsScene(ActionEvent event) throws IOException {
        mfc.switchToStudentsScene(event);
    }

    @FXML
    void createMonitor() {
        mfc.createMonitor(nameMonitor.getText(),emailMonitor.getText(),cellphoneMonitor.getText(),idMonitor.getText());
    }
}