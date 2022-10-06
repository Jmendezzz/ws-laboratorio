package com.example.laboratoriofinal.Controller;

import com.example.laboratoriofinal.Services.Impl.Laboratorio;
import com.example.laboratoriofinal.Services.ModelFactoryControllerService;
import com.example.laboratoriofinal.Services.MonitorService;
import javafx.event.ActionEvent;

import java.io.IOException;

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
    //****** FUNCIONES DE CAMBIOS DE ESCENA**********////
    @Override
    public void switchToMainMenu(ActionEvent e) throws IOException {
        laboratorio.getSceneService().switchToMainMenu( e);
    }

    @Override
    public void switchToStudentsScene(ActionEvent e) throws IOException {
        laboratorio.getSceneService().switchToStudentsScene(e);

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
    //********* ***********///


}
