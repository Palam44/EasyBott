package com.example.easybott.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("desktop")
public class Desktop extends Product {
    private String formFactor;


    public Desktop(Long id, String serialNumber, String manufacturer, double price, int quantity, String formFactor) {
        super(id, serialNumber, manufacturer, price, quantity);
        this.formFactor = formFactor;
    }

    public Desktop() {

    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

}
