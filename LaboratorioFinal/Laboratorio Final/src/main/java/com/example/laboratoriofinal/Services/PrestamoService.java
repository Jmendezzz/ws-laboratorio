package com.example.laboratoriofinal.Services;

import com.example.laboratoriofinal.Model.*;

public interface PrestamoService {
    void createLoan(Monitor monitor, Estudiante student);
    DetallePrestamo addObjectsToLoan(Objeto object, int amount);
}
