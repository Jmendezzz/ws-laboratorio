package com.example.laboratoriofinal.Services.Impl;
import com.example.laboratoriofinal.Model.Estudiante;
import com.example.laboratoriofinal.Model.Monitor;
import com.example.laboratoriofinal.Services.MonitorService;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;


public class MonitorImpl implements MonitorService {

    ObservableList<Monitor> observableListMonitor= FXCollections.observableArrayList();
    @Override //Crear monitor
    public void createMonitor(String name, String email, String cellphoneNumber, String id) {
        observableListMonitor.add(new Monitor(name,email,cellphoneNumber,id));
    }

    @Override //Modificar monitor
    public void modifyMonitor(String name, String email, String cellphoneNumber, String id,int position) {
        observableListMonitor.set(position,new Monitor(name,email,cellphoneNumber,id));
    }
    //Retornar lista de monitores para otros modulos.
    public ObservableList<Monitor> getObservableListMonitor() {
        return observableListMonitor;
    }

    @Override
    public boolean searchMonitor(String id) {// Buscar monitor por medio del id
            boolean band=false;
            for(Monitor mon : observableListMonitor){
                band=mon.getId().equals(id) ? band || true: band||false;
            }
            return band;
        }

}
