package com.example.laboratoriofinal.Services;

import com.example.laboratoriofinal.Model.Monitor;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.ArrayList;

public interface MonitorService {
    void createMonitor( String name, String email, String cellphoneNumber, String id) ;
    public ObservableList<Monitor> getObservableListMonitor();
}
