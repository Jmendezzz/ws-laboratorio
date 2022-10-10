package com.example.laboratoriofinal.Model;

public class Monitor extends Persona {
    int salary=0;
    int loansRealized=0;

    public Monitor(String name, String email, String cellphoneNumber, String id) {
        super(name, email, cellphoneNumber, id);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getLoansRealized() {
        return loansRealized;
    }

    public void setLoansRealized(int loansRealized) {
        this.loansRealized = loansRealized;
    }
}
