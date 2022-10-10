package com.example.laboratoriofinal.Services.Impl;

import com.example.laboratoriofinal.Model.Monitor;
import com.example.laboratoriofinal.Services.MonitorService;
import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.util.*;

public class MonitorImpl implements MonitorService {

    ObservableList<Monitor> observableListMonitor= FXCollections.observableArrayList();
    @Override
    public void createMonitor(String name, String email, String cellphoneNumber, String id) {
        observableListMonitor.add(new Monitor(name,email,cellphoneNumber,id));
    }

    public ObservableList<Monitor> getObservableListMonitor() {
        return observableListMonitor;
    }
}
