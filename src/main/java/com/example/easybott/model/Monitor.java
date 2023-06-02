package com.example.easybott.model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("monitor")
public class Monitor extends Product {
    private double diagonal;

    public Monitor(Long id, String serialNumber, String manufacturer, double price, int quantity, double diagonal) {
        super(id, serialNumber, manufacturer, price, quantity);
        this.diagonal = diagonal;
    }

    public Monitor() {

    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
}
