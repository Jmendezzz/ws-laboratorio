package com.example.laboratoriofinal.Model;

public class Persona {
    private String name;
    private String email;
    private String cellphoneNumber;
    private String id;

    public Persona(String name, String email, String cellphoneNumber, String id) {
        this.name = name;
        this.email = email;
        this.cellphoneNumber = cellphoneNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
