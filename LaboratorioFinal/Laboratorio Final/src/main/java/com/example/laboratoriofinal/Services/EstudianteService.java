package com.example.laboratoriofinal.Services;

import com.example.laboratoriofinal.Model.Estudiante;
import javafx.collections.ObservableList;

public interface EstudianteService {
    void createStudent(String name, String email, String cellphoneNumber, String id);
    ObservableList<Estudiante> getObservableListStudents();
    boolean searchEstudent(String id);
}
