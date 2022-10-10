package com.example.laboratoriofinal.Services;

import com.example.laboratoriofinal.Model.Objeto;

public interface ObjetoService {
    void createObject(String objectName, int amount, int loanPrice, boolean status);
    boolean searchObjectById(String id);
    void generateId(Objeto object);


}
