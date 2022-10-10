package com.example.laboratoriofinal.Services;

import com.example.laboratoriofinal.Model.Estudiante;
import com.example.laboratoriofinal.Model.Monitor;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.ArrayList;

public interface ModelFactoryControllerService {
    void createMonitor(String name, String email, String cellphoneNumber, String id);
    boolean searchMonitor(String id );
    public ObservableList<Monitor> getMonitorArrayList();
    void switchToMainMenu(ActionEvent e)  throws IOException;
    void switchScene(ActionEvent e,String resource) throws IOException;
    void switchToMonitorsScene(ActionEvent e) throws IOException;
    void switchToPrestamosScene(ActionEvent e) throws IOException;
    void switchToInventarioScene(ActionEvent e) throws IOException;
    void switchToStudentsScene(ActionEvent e) throws IOException;

    //Students functions
    void createStudent(String name, String email, String cellphoneNumber, String id);
    ObservableList<Estudiante> getObservableListStudents();
    boolean searchEstudent(String id);

}
