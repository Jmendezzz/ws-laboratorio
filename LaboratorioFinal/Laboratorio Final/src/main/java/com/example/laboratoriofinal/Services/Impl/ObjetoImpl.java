package com.example.laboratoriofinal.Services.Impl;

import com.example.laboratoriofinal.Model.Monitor;
import com.example.laboratoriofinal.Model.Objeto;
import com.example.laboratoriofinal.Services.ObjetoService;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class ObjetoImpl implements ObjetoService {
    ObservableList<Objeto> observableListObejeto= FXCollections.observableArrayList();
    @Override
    public void createObject(String objectName, int amount, int loanPrice, boolean status) {
        observableListObejeto.add(new Objeto(objectName,amount,loanPrice,status));
    }

    @Override // Buscar un objeto por un id de entrada ( los ids son asignados por el sistema )
    public boolean searchObjectById(String id) {
        boolean band=false;
        for(Objeto obj : observableListObejeto){
            band = obj.getId().equals(id)? band||true:band||false;
        }
        return band;
    }

    @Override // Generar un id de manera aleatoria, se crea un while interno para evitar que se repitan los ids (0-1000);
    public void generateId(Objeto object) {
        int random = (int)(Math.random()*1000);

        for(Objeto obj : observableListObejeto){
            while(random == Integer.parseInt(obj.getId())) {
                random = (int)(Math.random()*1000);
            }
        }
        object.setId(Integer.toString(random));

    }
}
