package com.example.laboratoriofinal.Services.Impl;

import com.example.laboratoriofinal.Model.Estudiante;
import com.example.laboratoriofinal.Services.EstudianteService;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class EstudianteImpl implements EstudianteService {
    ObservableList<Estudiante> observableListStudent= FXCollections.observableArrayList();
    @Override
    public void createStudent(String name, String email, String cellphoneNumber, String id) {
        observableListStudent.add(new Estudiante(name,email,cellphoneNumber,id));
    }

    @Override
    public ObservableList<Estudiante> getObservableListStudents() {
        return observableListStudent;
    }

    @Override
    public boolean searchEstudent(String id) { // Buscar estudiante por medio del id
        boolean band=false;
        for(Estudiante est : observableListStudent){
                band=est.getId().equals(id) ? band || true: band||false;
        }
        return band;
    }
}
