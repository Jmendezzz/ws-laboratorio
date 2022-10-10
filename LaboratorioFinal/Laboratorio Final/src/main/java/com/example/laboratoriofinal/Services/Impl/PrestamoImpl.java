package com.example.laboratoriofinal.Services.Impl;

import com.example.laboratoriofinal.Model.*;
import com.example.laboratoriofinal.Services.PrestamoService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class PrestamoImpl implements PrestamoService {

    ObservableList<Prestamo> prestamoObservableList = FXCollections.observableArrayList();

    @Override
    public void createLoan(Monitor monitor, Estudiante student) {
        Prestamo prestamo = new Prestamo(monitor,student);


    }

    @Override
    public DetallePrestamo addObjectsToLoan(Objeto object, int amount) {
      return  new DetallePrestamo(object,amount);
    }
}
