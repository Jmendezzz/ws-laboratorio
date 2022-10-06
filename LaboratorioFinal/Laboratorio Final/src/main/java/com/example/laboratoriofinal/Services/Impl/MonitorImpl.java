package com.example.laboratoriofinal.Services.Impl;

import com.example.laboratoriofinal.Model.Monitor;
import com.example.laboratoriofinal.Services.MonitorService;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.ArrayList;

public class MonitorImpl implements MonitorService {

    ArrayList<Monitor> monitorArrayList = new ArrayList<>();
    @Override
    public void createMonitor(String name, String email, String cellphoneNumber, String id) {
        monitorArrayList.add(new Monitor(name,email,cellphoneNumber,id));
        System.out.println("Works");
    }
}
