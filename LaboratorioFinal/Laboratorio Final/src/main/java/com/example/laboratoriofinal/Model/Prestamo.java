package com.example.laboratoriofinal.Model;

import java.util.ArrayList;

public class Prestamo {
    String id;
    Monitor monitor;
    Estudiante student;
    ArrayList<DetallePrestamo> detallePrestamoList = new ArrayList<>();
    int loanPrice;

    public Prestamo(Monitor monitor, Estudiante student) {
        this.monitor = monitor;
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Estudiante getStudent() {
        return student;
    }

    public void setStudent(Estudiante student) {
        this.student = student;
    }

    public ArrayList<DetallePrestamo> getDetallePrestamoList() {
        return detallePrestamoList;
    }

    public void setDetallePrestamoList(ArrayList<DetallePrestamo> detallePrestamoList) {
        this.detallePrestamoList = detallePrestamoList;
    }

    public int getLoanPrice() {
        return loanPrice;
    }

    public void setLoanPrice(int loanPrice) {
        this.loanPrice = loanPrice;
    }
}
