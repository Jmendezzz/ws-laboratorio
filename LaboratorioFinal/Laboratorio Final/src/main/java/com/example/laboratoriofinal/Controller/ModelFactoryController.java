package com.example.laboratoriofinal.Controller;

import com.example.laboratoriofinal.Model.Monitor;
import com.example.laboratoriofinal.Services.Impl.Laboratorio;
import com.example.laboratoriofinal.Services.ModelFactoryControllerService;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.ArrayList;

public class ModelFactoryController implements ModelFactoryControllerService {
    Laboratorio laboratorio;




    private static class SingletonHolder{

        private final static ModelFactoryController eINSTANCE = new  ModelFactoryController();

    }

    //Obtener instancia de la clase
    public static ModelFactoryController getInstance(){return SingletonHolder.eINSTANCE;}

    public ModelFactoryController(){
        laboratorio = new Laboratorio();
    }

    // Todas las funciones del programa;
    @Override
    public void createMonitor(String name, String email, String cellphoneNumber, String id) {
        laboratorio.getMonitorService().createMonitor(name,email,cellphoneNumber,id);

    }

    @Override
    public ObservableList<Monitor> getMonitorArrayList() {
        return laboratorio.getMonitorService().getObservableListMonitor();
    }

    //****** FUNCIONES DE CAMBIOS DE ESCENA**********////
    @Override
    public void switchToMainMenu(ActionEvent e) throws IOException {
        laboratorio.getSceneService().switchToMainMenu( e);
    }

    @Override
    public void switchScene(ActionEvent e, String resource) throws IOException {

        laboratorio.getSceneService().switchScene(e,resource);

    }
    @Override
    public void switchToMonitorsScene(ActionEvent e) throws IOException {
        laboratorio.getSceneService().switchToMonitorsScene(e);
    }

    @Override
    public void switchToPrestamosScene(ActionEvent e) throws IOException {
        laboratorio.getSceneService().switchToPrestamosScene(e);

    }

    @Override
    public void switchToInventarioScene(ActionEvent e) throws IOException {
        laboratorio.getSceneService().switchToInventarioScene(e);

    }

    @Override
    public void switchToStudentsScene(ActionEvent e) throws IOException {
        laboratorio.getSceneService().switchtoStudentsScene(e);
    }
    //********* ***********///


}
