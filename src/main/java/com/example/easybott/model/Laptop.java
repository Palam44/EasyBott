package com.example.easybott.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("laptop")
public class Laptop extends Product {
    private int screenSize;


    public Laptop(Long id, String serialNumber, String manufacturer, double price, int quantity, int screenSize) {
        super(id, serialNumber, manufacturer, price, quantity);
        this.screenSize = screenSize;
    }

    public Laptop() {

    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }


}
