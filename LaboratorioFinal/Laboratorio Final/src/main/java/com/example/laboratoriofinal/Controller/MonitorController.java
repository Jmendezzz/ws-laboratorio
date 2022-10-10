package com.example.laboratoriofinal.Controller;
import com.example.laboratoriofinal.Model.Monitor;
import com.example.laboratoriofinal.Model.Persona;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MonitorController<MOnitor> implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    @FXML
    private TextField cellphoneMonitor;

    @FXML
    private TableColumn<Monitor, String> emailCol;

    @FXML
    private TextField emailMonitor;

    @FXML
    private Button estudiantesButton;

    @FXML
    private TableColumn<Monitor, String> idCol;

    @FXML
    private TextField idMonitor;

    @FXML
    private Button inventarioButton;

    @FXML
    private TableColumn<Monitor, String> loanCol;

    @FXML
    private Button monitorButton;

    @FXML
    private TableColumn<Monitor, String>nameCol;

    @FXML
    private TextField nameMonitor;

    @FXML
    private Button prestamosButton;

    @FXML
    private TableColumn<Monitor, String>salaryCol;

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
        table.setItems(mfc.laboratorio.getMonitorService().getObservableListMonitor());
        table.refresh();
    }
    void modifyMonitor(){


    }
    @Override
    public void initialize(URL url, ResourceBundle rb){
        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        loanCol.setCellValueFactory(new PropertyValueFactory<>("loansRealized"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));

    }



}