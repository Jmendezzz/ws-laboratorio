package com.example.laboratoriofinal.Services;

import com.example.laboratoriofinal.Model.Monitor;
import javafx.collections.ObservableList;

public interface MonitorService {
    void createMonitor( String name, String email, String cellphoneNumber, String id) ;
    void modifyMonitor(String name, String email, String cellphoneNumber, String id, int position);
    public ObservableList<Monitor> getObservableListMonitor();
    boolean searchMonitor(String id);

}
