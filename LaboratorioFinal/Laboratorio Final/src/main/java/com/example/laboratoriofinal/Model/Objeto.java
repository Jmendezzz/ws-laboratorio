package com.example.laboratoriofinal.Model;

public class Objeto {

    private String objectName;
    private  String id;
    private int amount;
    private int loanPrice;
    private boolean status;

    public Objeto(String objectName, int amount, int loanPrice, boolean status) {
        this.objectName = objectName;
        this.amount = amount;
        this.loanPrice = loanPrice;
        this.status = status;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getLoanPrice() {
        return loanPrice;
    }

    public void setLoanPrice(int loanPrice) {
        this.loanPrice = loanPrice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
