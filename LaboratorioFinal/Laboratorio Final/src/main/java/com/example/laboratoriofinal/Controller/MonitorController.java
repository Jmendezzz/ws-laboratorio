package com.example.laboratoriofinal.Controller;
import com.example.laboratoriofinal.Model.Monitor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MonitorController {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    @FXML
    private TextField cellphoneMonitor;

    @FXML
    private TextField emailMonitor;

    @FXML
    private Button estudiantesButton;

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
    private TableView<Monitor> table;



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
    void swithToStudentsScene(ActionEvent event)throws IOException{
        mfc.switchToStudentsScene(event);
    }

    @FXML
    void createMonitor() {
        mfc.createMonitor(nameMonitor.getText(),emailMonitor.getText(),cellphoneMonitor.getText(),idMonitor.getText());
        uploadTable();
    }
    @FXML

    void uploadTable(){
        nameCol
        table.setItems(mfc.laboratorio.getMonitorService().getObservableListMonitor());

    }


}